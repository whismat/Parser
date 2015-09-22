package jesusignacio.es.parser;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v4.content.IntentCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

import com.rey.material.widget.Slider;
import com.software.shell.fab.ActionButton;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by jesusignacio on 30/06/15.
 */
public class Pre_simulacro extends AppCompatActivity {
    private Toolbar toolbar;
    private Slider slider;


    private XmlPullParserFactory xmlFactoryObject;
    public static boolean parsingComplete = true;

    private static ArrayList<String[][]> simulacro = new ArrayList<String[][]>();

    InputStream inputstream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //Elegir el layourt del contenido
        setContentView(R.layout.layout_pre_simulacro);

        //Capturar las variables del intent
        Intent myIntent = getIntent(); // gets the previously created intent
        final int intent_id = myIntent.getIntExtra("id", 0) + 1; // Le sumo 1 porque el primer elemento de la lista devuelve 0, y no 1
        final String intent_asignatura= myIntent.getStringExtra("asignatura"); // will return "SecondKeyValue"

        //Crear y cambiar el título a la Toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar_main);

        //Cambiar el título
        toolbar.setTitle(intent_asignatura);

        setSupportActionBar(toolbar);

        getSupportActionBar().
                setDisplayHomeAsUpEnabled(true);

        //Listener para volver atrás
        toolbar.setNavigationOnClickListener(new View.OnClickListener()

                                             {
                                                 @Override
                                                 public void onClick(View view) {
                                                     NavUtils.navigateUpTo(Pre_simulacro.this, IntentCompat.makeMainActivity(new ComponentName(Pre_simulacro.this, Pre_simulacro.class)));
                                                 }
                                             }

        );

        slider = (Slider) findViewById(R.id.pre_simulacro_slider);

        //Crear el Floating Action Button
        final ActionButton actionButton = (ActionButton) findViewById(R.id.pre_simulacro_action_button);
        actionButton.setRippleEffectEnabled(false);

        //Le cambio el color a la ActionBar y al ActionButton

        {
        if(intent_id==1)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_1));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_1b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_1));
            slider.setPrimaryColor(getResources().getColor(R.color.color_1));

            inputstream = getResources().openRawResource(R.raw.examen1);
        }

        else if(intent_id==2)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_2));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_2b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_2));
            slider.setPrimaryColor(getResources().getColor(R.color.color_2));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==3)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_3));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_3b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_3));
            slider.setPrimaryColor(getResources().getColor(R.color.color_3));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==4)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_4));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_4b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_4));
            slider.setPrimaryColor(getResources().getColor(R.color.color_4));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==5)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_5));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_5b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_5));
            slider.setPrimaryColor(getResources().getColor(R.color.color_5));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==6)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_6));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_6b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_6));
            slider.setPrimaryColor(getResources().getColor(R.color.color_6));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==7)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_7));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_7b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_7));
            slider.setPrimaryColor(getResources().getColor(R.color.color_7));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==8)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_8));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_8b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_8));
            slider.setPrimaryColor(getResources().getColor(R.color.color_8));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==9)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_9));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_9b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_9));
            slider.setPrimaryColor(getResources().getColor(R.color.color_9));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==10)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_10));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_10b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_10));
            slider.setPrimaryColor(getResources().getColor(R.color.color_10));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==11)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_11));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_11b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_11));
            slider.setPrimaryColor(getResources().getColor(R.color.color_11));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==12)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_12));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_12b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_12));
            slider.setPrimaryColor(getResources().getColor(R.color.color_12));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==13)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_13));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_13b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_13));
            slider.setPrimaryColor(getResources().getColor(R.color.color_13));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==14)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_14));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_14b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_14));
            slider.setPrimaryColor(getResources().getColor(R.color.color_14));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==15)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_15));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_15b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_15));
            slider.setPrimaryColor(getResources().getColor(R.color.color_15));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==16)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_16));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_16b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_16));
            slider.setPrimaryColor(getResources().getColor(R.color.color_16));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==17)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_17));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_17b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_17));
            slider.setPrimaryColor(getResources().getColor(R.color.color_17));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==18)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_18));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_18b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_18));
            slider.setPrimaryColor(getResources().getColor(R.color.color_18));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==19)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_19));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_19b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_19));
            slider.setPrimaryColor(getResources().getColor(R.color.color_19));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==20)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_20));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_20b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_20));
            slider.setPrimaryColor(getResources().getColor(R.color.color_20));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==21)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_21));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_21b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_21));
            slider.setPrimaryColor(getResources().getColor(R.color.color_21));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==22)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_22));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_22b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_22));
            slider.setPrimaryColor(getResources().getColor(R.color.color_22));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==23)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_23));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_23b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_23));
            slider.setPrimaryColor(getResources().getColor(R.color.color_23));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==24)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_24));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_24b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_24));
            slider.setPrimaryColor(getResources().getColor(R.color.color_24));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==25)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_25));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_25b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_25));
            slider.setPrimaryColor(getResources().getColor(R.color.color_25));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==26)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_26));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_26b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_26));
            slider.setPrimaryColor(getResources().getColor(R.color.color_26));

            inputstream = getResources().openRawResource(R.raw.sample);
        }

        else if(intent_id==27)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_27));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_27b));
            actionButton.setButtonColor(getResources().getColor(R.color.color_27));
            slider.setPrimaryColor(getResources().getColor(R.color.color_27));

            inputstream = getResources().openRawResource(R.raw.sample);
        }
        }
        try {
            //Borrar todo el contenido del Arraylist simulacro
            simulacro.clear();
            readXML();
            Log.i("EIR-App totalpreguntas:", Integer.toString(simulacro.size()));

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

        //Crear el OnClickListener para pasar simulacro1 a Simulacro_1 mediante intent
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    SystemClock.sleep(500);
                    Intent myIntent = new Intent(Pre_simulacro.this, Simulacro_1.class);
                    myIntent.putExtra("asignatura", intent_asignatura);
                    myIntent.putExtra("intent_id", intent_id);
                    myIntent.putExtra("simulacro", simulacro);
                    startActivity(myIntent);

            }
        });

    }

    private void readXML() throws XmlPullParserException {

        try {

            xmlFactoryObject = XmlPullParserFactory.newInstance();
            XmlPullParser parser = xmlFactoryObject.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);

            parser.setInput(inputstream, null);
            Log.i("EIR-App", "Cargando XML");
            parseXML(parser);
        }
        catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    }

    public static void parseXML(XmlPullParser parser) {
        int event;
        String text = null;
        int i_respuesta = 0;

        //ArrayList<String[]> bloque = new ArrayList<String[]>();
        String[][] pregunta = new String[5][];
        String[] opciones = new String[5];


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

                            String[] code = new String[1];
                            Log.i("EIR-App code", text);
                            code[0] = text;
                            pregunta[0] = code;
                            //bloque.add(code);
                        }

                        else if (name.equals("enunciado")) {

                            String[] enunciado = new String[1];
                            Log.i("EIR-App enunciado", text);
                            enunciado[0] = text;
                            pregunta[1] = enunciado;

                            //bloque.add(enunciado);
                        }

                        else if (name.equals("opcion")) {

                            if (i_respuesta == 0) {

                                opciones[0] = text;
                                Log.i("EIR-App opcion1", text);
                                i_respuesta++;

                            }
                            else if (i_respuesta == 1) {

                                opciones[1] = text;
                                Log.i("EIR-App opcion2", text);
                                i_respuesta++;

                            }
                            else if (i_respuesta == 2) {

                                opciones[2] = text;
                                Log.i("EIR-App opcion3", text);
                                i_respuesta++;

                            }
                            else if (i_respuesta == 3) {

                                opciones[3] = text;
                                Log.i("EIR-App opcion4", text);
                                i_respuesta++;

                            }
                            else if (i_respuesta == 4) {

                                opciones[4] = text;
                                Log.i("EIR-App opcion5", text);
                                pregunta[2] = opciones;
                                
                            }
                        }
                        else {
                            if (name.equals("respuesta")) {
                                String[] respuesta = new String[1];
                                Log.i("EIR-App respuesta", text);
                                respuesta[0] = text;
                                String[] resultado = new String[1];
                                resultado[0] = "0";

                                //bloque.add(opciones);
                                //bloque.add(respuesta);
                                //bloque.add(resultado);
                                pregunta[3] = respuesta;
                                pregunta[4] = resultado;

                            } else if (name.equals("pregunta")) {
                                i_respuesta = 0;
                                simulacro.add(pregunta);
                            }
                        }

                        break;

                }
                event = parser.next();
            }
            parsingComplete = false;


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
