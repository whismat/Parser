package jesusignacio.es.parser;

import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class Parser extends AppCompatActivity {

    private String[] aCountries;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private Toolbar toolbar;
    private XmlPullParserFactory xmlFactoryObject;
    public volatile boolean parsingComplete = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_parser);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //Añado el Drawer Layout
        aCountries = getResources().getStringArray(R.array.countries);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_listview);
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, aCountries));


        mDrawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout,
                toolbar,
                R.string.drawer_open,
                R.string.drawer_close) {

            public void onDrawerClosed(View view) {
                //Acciones al cerrar la navigations
            }

            public void onDrawerOpened(View drawerView) {
                //Acciones al abrir la navigation
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mDrawerToggle.syncState();

        try {
          readXML();
        }
        catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    }


        //////////////////////////////////////////////////////////////////////////////////////////////////////
        // XML


    private void readXML() throws XmlPullParserException {

        //Declarar la la variable documentoxml en función de la asignatura que se mostrará

        int documentoxml = R.raw.anatomia;

        InputStream inputstream = null;
        try {

            inputstream = getResources().openRawResource(documentoxml);

            xmlFactoryObject = XmlPullParserFactory.newInstance();
            XmlPullParser parser = xmlFactoryObject.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);

            parser.setInput(inputstream, null);
            Log.i("EIR-App", "Cargado XML");
            parseXML(parser);
        }
        catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    }

    public void parseXML(XmlPullParser parser) {
        int event;
        String text = null;
        String enunciado = null, opcion1 = null, opcion2 = null, opcion3 = null, opcion4 = null, opcion5 = null;
        int i_bloque = 0;
        int i_respuesta = 0;

        //Crear ArrayList simulacro
        //Crear ArrayList bloque, que serán los nodos del ArrayList simulacro
        //Posiciones:
        // 0 = enunciado, 1 = code, 2 = respuesta, 3 = ArrayList de Opciones



        ArrayList<String[]> simulacro = new ArrayList<String[]>();
        String[] bloque = new String[8];


        try {
            event = parser.getEventType();

            while (event != XmlPullParser.END_DOCUMENT) {
                String name = parser.getName();

                switch (event) {

                    case XmlPullParser.START_TAG:
                        break;

                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;

                    case XmlPullParser.END_TAG:

                        if (name.equals("code")) {

                            //int code = Integer.parseInt(text);
                            bloque = new String[8]; // create a new array
                            //Log.i("EIR-App, Code", Integer.toString(code));
                            bloque[0] = text;


                        }

                        else if (name.equals("enunciado")) {

                            Log.i("EIR-App", text);
                            bloque[1] = text;

                        }

                        else if (name.equals("opcion")) {

                            if (i_respuesta == 0) {
                                Log.i("EIR-App, Opcion 1:", text + Integer.toString(i_respuesta));
                                bloque[2] = text;
                                i_respuesta++;

                            }
                            else if (i_respuesta == 1) {
                                Log.i("EIR-App, Opcion 2:", text + Integer.toString(i_respuesta));
                                bloque[3] = text;
                                i_respuesta++;

                            }
                            else if (i_respuesta == 2) {
                                Log.i("EIR-App, Opcion 3:", text + Integer.toString(i_respuesta));
                                bloque[4] = text;
                                i_respuesta++;

                            }
                            else if (i_respuesta == 3) {
                                Log.i("EIR-App, Opcion 4:", text + Integer.toString(i_respuesta));
                                bloque[5] = text;
                                i_respuesta++;

                            }
                            else if (i_respuesta == 4) {
                                Log.i("EIR-App, Opcion 5:", text + Integer.toString(i_respuesta));
                                bloque[6] = text;
                                i_respuesta = 0;
                            }
                        }
                        else if (name.equals("respuesta")) {
                            int respuesta = Integer.parseInt(text);;
                            Log.i("EIR-App, Respuesta:", Integer.toString(respuesta));
                            bloque[7] = text;
                            //Añadir bloque a simulacro:
                            simulacro.add(bloque);
                            Log.i("EIR-App, simulacro.size", Integer.toString(simulacro.size()));


                        }
                        break;
                }
                event = parser.next();
            }
            parsingComplete = false;

        } catch (Exception e) {
            e.printStackTrace();
        }

        //PRUEBAS PARA OBTENER LOS STRINGS A PARTIR DEL ARRAYLIST

        TextView txt_enunciado = (TextView) findViewById(R.id.show_enunciado);

        String[] prueba1 = simulacro.get(630);
        String prueba2 = prueba1[1];
        Log.i("EIR-App, Respuesta:", prueba1[1]);
        txt_enunciado.setText(prueba2);



        TextView txt_opcion1 = (TextView) findViewById(R.id.show_opcion1);
        TextView txt_opcion2 = (TextView) findViewById(R.id.show_opcion2);
        TextView txt_opcion3 = (TextView) findViewById(R.id.show_opcion3);
        TextView txt_opcion4 = (TextView) findViewById(R.id.show_opcion4);
        TextView txt_opcion5 = (TextView) findViewById(R.id.show_opcion5);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_parser, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

