package jesusignacio.es.parser;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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

    private XmlPullParserFactory xmlFactoryObject;
    public volatile boolean parsingComplete = true;
    final ArrayList<String[]> simulacro = new ArrayList<String[]>();
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



        //Crear el Floating Action Button
        ActionButton actionButton = (ActionButton) findViewById(R.id.pre_simulacro_action_button);
        actionButton.setRippleEffectEnabled(false);


        //Le cambio el color a la ActionBar y al ActionButton

        if(intent_id==1)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_1));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_1));
            actionButton.setButtonColor(getResources().getColor(R.color.color_1));

            inputstream = getResources().openRawResource(R.raw.examen1);
        }

        else if(intent_id==2)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_2));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_2));
            actionButton.setButtonColor(getResources().getColor(R.color.color_2));
        }

        else if(intent_id==3)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_3));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_3));
            actionButton.setButtonColor(getResources().getColor(R.color.color_3));
        }

        else if(intent_id==4)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_4));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_4));
            actionButton.setButtonColor(getResources().getColor(R.color.color_4));
        }

        else if(intent_id==5)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_5));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_5));
            actionButton.setButtonColor(getResources().getColor(R.color.color_5));
        }

        else if(intent_id==6)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_6));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_6));
            actionButton.setButtonColor(getResources().getColor(R.color.color_6));
        }

        else if(intent_id==7)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_7));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_7));
            actionButton.setButtonColor(getResources().getColor(R.color.color_7));
        }

        else if(intent_id==8)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_8));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_8));
            actionButton.setButtonColor(getResources().getColor(R.color.color_8));
        }

        else if(intent_id==9)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_9));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_9));
            actionButton.setButtonColor(getResources().getColor(R.color.color_9));
        }

        else if(intent_id==10)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_10));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_10));
            actionButton.setButtonColor(getResources().getColor(R.color.color_10));
        }

        else if(intent_id==11)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_11));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_11));
            actionButton.setButtonColor(getResources().getColor(R.color.color_11));
        }

        else if(intent_id==12)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_12));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_12));
            actionButton.setButtonColor(getResources().getColor(R.color.color_12));
        }

        else if(intent_id==13)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_13));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_13));
            actionButton.setButtonColor(getResources().getColor(R.color.color_13));
        }

        else if(intent_id==14)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_14));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_14));
            actionButton.setButtonColor(getResources().getColor(R.color.color_14));
        }

        else if(intent_id==15)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_15));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_15));
            actionButton.setButtonColor(getResources().getColor(R.color.color_15));
        }

        else if(intent_id==16)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_16));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_16));
            actionButton.setButtonColor(getResources().getColor(R.color.color_16));
        }

        else if(intent_id==17)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_17));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_17));
            actionButton.setButtonColor(getResources().getColor(R.color.color_17));
        }

        else if(intent_id==18)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_18));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_18));
            actionButton.setButtonColor(getResources().getColor(R.color.color_18));
        }

        else if(intent_id==19)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_19));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_19));
            actionButton.setButtonColor(getResources().getColor(R.color.color_19));
        }

        else if(intent_id==20)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_20));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_20));
            actionButton.setButtonColor(getResources().getColor(R.color.color_20));
        }

        else if(intent_id==21)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_21));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_21));
            actionButton.setButtonColor(getResources().getColor(R.color.color_21));
        }

        else if(intent_id==22)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_22));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_22));
            actionButton.setButtonColor(getResources().getColor(R.color.color_22));
        }

        else if(intent_id==23)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_23));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_23));
            actionButton.setButtonColor(getResources().getColor(R.color.color_23));
        }

        else if(intent_id==24)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_24));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_24));
            actionButton.setButtonColor(getResources().getColor(R.color.color_24));
        }

        else if(intent_id==25)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_25));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_25));
            actionButton.setButtonColor(getResources().getColor(R.color.color_25));
        }

        else if(intent_id==26)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_26));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_26));
            actionButton.setButtonColor(getResources().getColor(R.color.color_26));
        }

        else if(intent_id==27)
        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_27));
            actionButton.setButtonColorPressed(getResources().getColor(R.color.color_27));
            actionButton.setButtonColor(getResources().getColor(R.color.color_27));
        }

        try {
           readXML();

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }


        //Crear el OnClickListener para cargar el XML con la función readXML y pasar a Simulacro_1 mediante intent
        actionButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

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

    public void parseXML(XmlPullParser parser) {
        int event;
        String text = null;
        int i_respuesta = 0;

        //Crear ArrayList simulacro
        //Crear ArrayList bloque, que serán los nodos del ArrayList simulacro
        //Posiciones:

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

                            bloque = new String[8]; // create a new array
                            Log.i("EIR-App code", text);
                            bloque[0] = text;
                        }

                        else if (name.equals("enunciado")) {

                            bloque[1] = text;
                            Log.i("EIR-App enunciado", text);

                        }

                        else if (name.equals("opcion")) {

                            if (i_respuesta == 0) {

                                bloque[2] = text;
                                Log.i("EIR-App opcion1", text);
                                i_respuesta++;

                            }
                            else if (i_respuesta == 1) {

                                bloque[3] = text;
                                Log.i("EIR-App opcion2", text);
                                i_respuesta++;

                            }
                            else if (i_respuesta == 2) {

                                bloque[4] = text;
                                Log.i("EIR-App opcion3", text);
                                i_respuesta++;

                            }
                            else if (i_respuesta == 3) {

                                bloque[5] = text;
                                Log.i("EIR-App opcion4", text);
                                i_respuesta++;

                            }
                            else if (i_respuesta == 4) {

                                bloque[6] = text;
                                Log.i("EIR-App opcion5", text);
                                
                            }
                        }
                        else if (name.equals("respuesta")) {
                            bloque[7] = text;

                        }
                        else if (name.equals("pregunta")) {

                            //Añadir bloque a simulacro:
                            i_respuesta = 0;
                            simulacro.add(bloque);
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
