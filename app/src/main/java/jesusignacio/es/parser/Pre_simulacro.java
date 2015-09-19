package jesusignacio.es.parser;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    private ImageButton button;
    public int documentoxml;
    public int color_asignatura;
    public String intent_asignatura;
    private XmlPullParserFactory xmlFactoryObject;
    public volatile boolean parsingComplete = true;
    final ArrayList<String[]> simulacro = new ArrayList<String[]>();

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
            int documentoxml = R.raw.examen1;
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


        //Crear el OnClickListener para cargar el XML con la función readXML y pasar a Simulacro_1 mediante intent
        actionButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                try {
                    readXML();

                    Intent myIntent = new Intent(Pre_simulacro.this, Simulacro_1.class);
                    myIntent.putExtra("asignatura", intent_asignatura);
                    myIntent.putExtra("intent_id", intent_id);
                    myIntent.putExtra("simulacro", simulacro);
                    startActivity(myIntent);

                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                }


            }
        });

    }

    private void readXML() throws XmlPullParserException {


        InputStream inputstream = null;
        try {

            inputstream = getResources().openRawResource(R.raw.examen1);

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

                            bloque[0] = text;


                        }

                        else if (name.equals("enunciado")) {


                            bloque[1] = text;

                        }

                        else if (name.equals("opcion")) {

                            if (i_respuesta == 0) {

                                bloque[2] = text;
                                i_respuesta++;

                            }
                            else if (i_respuesta == 1) {

                                bloque[3] = text;
                                i_respuesta++;

                            }
                            else if (i_respuesta == 2) {

                                bloque[4] = text;
                                i_respuesta++;

                            }
                            else if (i_respuesta == 3) {

                                bloque[5] = text;
                                i_respuesta++;

                            }
                            else if (i_respuesta == 4) {

                                bloque[6] = text;
                                i_respuesta = 0;
                            }
                        }
                        else if (name.equals("respuesta")) {
                            int respuesta = Integer.parseInt(text);;

                            bloque[7] = text;
                            //Añadir bloque a simulacro:
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
