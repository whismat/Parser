package jesusignacio.es.parser;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jesusignacio on 30/06/15.
 */
public class Simulacro_1 extends AppCompatActivity {

    private Toolbar toolbar;
    private RelativeLayout lowestLayout;
    private ScrollView fondo_enunciado;

    //private String[][] pregunta = Arrays.copyOf(pregunta2, pregunta2.length, String[][].class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_simulacro);

        Intent myIntent = getIntent(); // gets the previously created intent

        final String intent_asignatura = myIntent.getStringExtra("asignatura"); // will return "SecondKeyValue"
        final int intent_id = myIntent.getIntExtra("intent_id", 0); // here 0 is the default value
        //final ArrayList simulacro = myIntent.getStringExtra("simulacro");
        ArrayList<String[][]> simulacro = (ArrayList<String[][]>) myIntent.getSerializableExtra("simulacro");


        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitle(intent_asignatura);
        setSupportActionBar(toolbar);
        getSupportActionBar().
        setDisplayHomeAsUpEnabled(true);

        fondo_enunciado = (ScrollView) findViewById(R.id.textAreaScroller);

        TextView txtEnunciado = (TextView)findViewById(R.id.show_enunciado);
        TextView txtOpcion1 = (TextView)findViewById(R.id.show_opcion1);
        TextView txtOpcion2 = (TextView)findViewById(R.id.show_opcion2);
        TextView txtOpcion3 = (TextView)findViewById(R.id.show_opcion3);
        TextView txtOpcion4 = (TextView)findViewById(R.id.show_opcion4);
        TextView txtOpcion5 = (TextView)findViewById(R.id.show_opcion5);


        Log.i("Intent!:", Integer.toString(simulacro.size()));

        toolbar.setNavigationOnClickListener(new View.OnClickListener()

                                             {
                                                 @Override
                                                 public void onClick(View view) {
                                                     NavUtils.navigateUpTo(Simulacro_1.this, IntentCompat.makeMainActivity(new ComponentName(Simulacro_1.this, Simulacro_1.class)));
                                                 }
                                             }

        );

        txtOpcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "¡Incorrecto!", Snackbar.LENGTH_SHORT).show();
            }

        });
        txtOpcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "¡Correcto!", Snackbar.LENGTH_SHORT).show();
            }

        });
        txtOpcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "¡Incorrecto!", Snackbar.LENGTH_SHORT).show();
            }

        });
        txtOpcion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "¡Incorrecto!", Snackbar.LENGTH_SHORT).show();
            }

        });
        txtOpcion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "¡Incorrecto!", Snackbar.LENGTH_SHORT).show();
            }

        });

        //Cambiar el color a la ActionBar
        if(intent_id==1)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_1));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_1b));

        }

        else if(intent_id==2)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_2));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_2b));

        }

        else if(intent_id==3)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_3));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_3b));

        }

        else if(intent_id==4)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_4));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_4b));

        }

        else if(intent_id==5)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_5));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_5b));

        }

        else if(intent_id==6)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_6));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_6b));

        }

        else if(intent_id==7)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_7));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_7b));

        }

        else if(intent_id==8)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_8));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_8b));

        }

        else if(intent_id==9)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_9));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_9b));

        }

        else if(intent_id==10)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_10));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_10b));

        }

        else if(intent_id==11)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_11));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_11b));

        }

        else if(intent_id==12)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_12));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_12b));

        }

        else if(intent_id==13)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_13));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_13b));

        }

        else if(intent_id==14)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_14));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_14b));

        }

        else if(intent_id==15)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_15));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_15b));

        }

        else if(intent_id==16)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_16));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_16b));

        }

        else if(intent_id==17)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_17));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_17b));

        }

        else if(intent_id==18)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_18));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_18b));

        }

        else if(intent_id==19)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_19));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_19b));

        }

        else if(intent_id==20)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_20));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_20b));
         }

        else if(intent_id==21)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_21));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_21b));
        }

        else if(intent_id==22)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_22));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_22b));

        }

        else if(intent_id==23)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_23));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_23b));
        }

        else if(intent_id==24)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_24));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_24b));

        }

        else if(intent_id==25)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_25));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_25b));

        }

        else if(intent_id==26)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_26));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_26b));

        }

        else if(intent_id==27)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_27));
            fondo_enunciado.setBackgroundColor(getResources().getColor(R.color.color_27b));

        }



        ////////////////////////////////////////////////////////////////////////////////////////////////
        //Añadir elementos


        //Crear String[][] Pregunta

        String[][] pregunta = new String[5][];
        pregunta = simulacro.get(0);
        Log.d("PEPE:", pregunta[0][1]);

        //A borrar:
        //String enunciadostring = pregunta[1][0];
        //String opcion1string = pregunta[2][0];
        //String opcion2string = pregunta[2][1];
        //String opcion3string = pregunta[2][2];
        //String opcion4string = pregunta[2][3];
        //String opcion5string = pregunta[2][4];

        //txtEnunciado.setText(enunciadostring);

        //txtOpcion1.setText(opcion1string);

        //txtOpcion2.setText(opcion2string);

        //txtOpcion3.setText(opcion3string);

        //txtOpcion4.setText(opcion4string);

        //txtOpcion5.setText(opcion5string);

        //Listeners:

        //Swipe

        ActivitySwipeDetector activitySwipeDetector = new ActivitySwipeDetector(this);
        lowestLayout = (RelativeLayout)this.findViewById(R.id.layout_simulacro);
        lowestLayout.setOnTouchListener(activitySwipeDetector);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Crear el menu y añadir los elementos.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Gestionar los clicks sobre los elementos del menu.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
