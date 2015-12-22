package jesusignacio.es.parser;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import com.lsjwzh.widget.materialloadingprogressbar.CircleProgressBar;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PageFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
    private GridView gridView;
    private FloatingActionButton actionButton;
    private FloatingActionButton actionButton_mini;
    View view;
    private String respuesta;
    private int code;
    private boolean finalizada = false;
    LinearLayout linearlayout;
    TextView txtEnunciado;
    ScrollView fondo_enunciado;
    AlertDialog alertDialog;
    CircleProgressBar progressBar;
    //

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
        respuesta = Pregunta.simulacro.get(mPage).getRespuesta();
        code = Pregunta.simulacro.get(mPage).getCode();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (finalizada == false){
            if (mPage != Global.tamano_simulacro) {

                view = inflater.inflate(R.layout.pregunta_layout, container, false);
                finalizada = true;

            }
            else {
                view = inflater.inflate(R.layout.pregunta_layout_end, container, false);

                actionButton = (FloatingActionButton) view.findViewById(R.id.end_simulacro_action_button);
                actionButton.setBackgroundTintList(getResources().getColorStateList(Global.color_a));
                progressBar = (CircleProgressBar) view.findViewById(R.id.progressBar_end);
                progressBar.setColorSchemeColors(getResources().getColor(Global.color_a));
                progressBar.setVisibility(View.INVISIBLE);
                actionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        progressBar.setVisibility(View.VISIBLE);
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent myIntent = new Intent(view.getContext(), Activity_Resultado.class);
                                startActivityForResult(myIntent, 0);
                            }
                        }, 1500);

                    }
                });
            }

            txtEnunciado = (TextView) view.findViewById(R.id.show_enunciado);
            fondo_enunciado = (ScrollView) view.findViewById(R.id.textAreaScroller);
            gridView = (GridView)getActivity().findViewById(R.id.gridView);
            fondo_enunciado.setBackgroundColor(getResources().getColor(Global.color_b));
            linearlayout = (LinearLayout) view.findViewById(R.id.pregunta_layout_linearlayout);
            linearlayout.setBackgroundColor(getResources().getColor(Global.color_b));
            txtEnunciado.setText(Pregunta.simulacro.get(mPage).getEnunciado());

            respuestas();
            actionButton_mini = (FloatingActionButton) view.findViewById(R.id.actionbutton_reportar);
            actionButton_mini.setBackgroundTintList(getResources().getColorStateList(R.color.actionbutton_reportar));
            actionButton_mini.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reportarPregunta().show();

                }
            });
        }
        return view;

    }
    private AlertDialog reportarPregunta() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        final CharSequence[] items = new CharSequence[3];

        items[0] = "La respuesta es incorrecta";
        items[1] = "El enunciado está mal redactado";
        items[2] = "Las opciones no deberían estar desordenadas";

        builder.setTitle("Reportar pregunta [" + Integer.toString(code) + "]")
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        return builder.create();
    }
    private void respuestas(){

        fondo_enunciado.setBackgroundColor(getResources().getColor(Global.color_b));

        final ListView listview = (ListView) view.findViewById(R.id.opciones_respuesta);
        final ArrayList<String> list = Pregunta.simulacro.get(mPage).getOpciones();
        final ArrayAdapter adapter = new ArrayAdapter(getActivity(),R.layout.simple_list_item, list);

        listview.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String string_seleccionada = (adapterView.getItemAtPosition(i).toString());

                //Log.i("selectedFromList", string_seleccionada);

                if (string_seleccionada == respuesta){
                    Global.correctas++;
                    gridView.getChildAt((mPage - 1)).setBackgroundResource(R.drawable.shape_border_correcta);

                }

                else {
                    Global.incorrectas++;
                    gridView.getChildAt((mPage - 1)).setBackgroundResource(R.drawable.shape_border_incorrecta);
                }

                Context context = getActivity().getApplicationContext();
                String[] lista_opciones = list.toArray(new String[list.size()]);

                listview.setAdapter(new ListViewAdapter(context, lista_opciones, respuesta, string_seleccionada));

                listview.setOnItemClickListener(null);
                listview.setFocusable(false);
                listview.setSelector(android.R.color.transparent);
                listview.setClickable(false);
            }
        });
        listview.setAdapter(adapter);

    }

    private class ListViewAdapter extends BaseAdapter{
        String[] ListViewAdapter_list;
        String ListViewAdapter_respuesta;
        String ListViewAdapter_seleccionada;

        private LayoutInflater inflater=null;
        public ListViewAdapter(Context context, String[] list, String respuesta, String clickada){
            ListViewAdapter_list = list;
            ListViewAdapter_respuesta = respuesta;
            ListViewAdapter_seleccionada = clickada;
            inflater = ( LayoutInflater )context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return ListViewAdapter_list.length;
        }
        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View rowView;
            rowView = inflater.inflate(R.layout.simple_list_item, null);
            TextView tv =(TextView) rowView.findViewById(R.id.simple_list_item);
            tv.setText(ListViewAdapter_list[position]);
            tv.setTextColor(getResources().getColor(R.color.my_accent));

            if (ListViewAdapter_list[position] == ListViewAdapter_respuesta){
                tv.setBackgroundResource(R.drawable.shape_border_correcta);
                tv.setTextColor(Color.parseColor("#202020"));
            }
            else if ((ListViewAdapter_list[position] == ListViewAdapter_seleccionada) && (ListViewAdapter_seleccionada != ListViewAdapter_respuesta)) {
                tv.setBackgroundResource(R.drawable.shape_border_incorrecta);
                tv.setTextColor(Color.parseColor("#202020"));
            }

            return rowView;

        }
    }
    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }
    }
}



