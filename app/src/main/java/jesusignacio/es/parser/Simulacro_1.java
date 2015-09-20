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
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jesusignacio on 30/06/15.
 */
public class Simulacro_1 extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_simulacro);

        Intent myIntent = getIntent(); // gets the previously created intent

        final String intent_asignatura= myIntent.getStringExtra("asignatura"); // will return "SecondKeyValue"
        final int intent_id = myIntent.getIntExtra("intent_id", 0); // here 0 is the default value
        final String enunciadostring = myIntent.getStringExtra("simulacrostring");

        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitle(intent_asignatura);


        //Cambiar el color a la ActionBar
        if(intent_id==1)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_1));
        }

        else if(intent_id==2)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_2));

        }

        else if(intent_id==3)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_3));

        }

        else if(intent_id==4)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_4));

        }

        else if(intent_id==5)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_5));

        }

        else if(intent_id==6)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_6));

        }

        else if(intent_id==7)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_7));

        }

        else if(intent_id==8)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_8));

        }

        else if(intent_id==9)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_9));

        }

        else if(intent_id==10)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_10));

        }

        else if(intent_id==11)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_11));

        }

        else if(intent_id==12)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_12));

        }

        else if(intent_id==13)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_13));

        }

        else if(intent_id==14)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_14));

        }

        else if(intent_id==15)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_15));

        }

        else if(intent_id==16)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_16));

        }

        else if(intent_id==17)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_17));

        }

        else if(intent_id==18)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_18));

        }

        else if(intent_id==19)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_19));

        }

        else if(intent_id==20)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_20));
         }

        else if(intent_id==21)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_21));
        }

        else if(intent_id==22)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_22));

        }

        else if(intent_id==23)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_23));
        }

        else if(intent_id==24)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_24));

        }

        else if(intent_id==25)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_25));

        }

        else if(intent_id==26)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_26));

        }

        else if(intent_id==27)

        {
            toolbar.setBackgroundColor(getResources().getColor(R.color.color_27));

        }

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ////////////////////////////////////////////////////////////////////////////////////////////////
        //Añadir elementos
        //ArrayList Simulacro
        ArrayList<ArrayList<String[]>> simulacro = new ArrayList<ArrayList<String[]>>();
        //ArrayList Bloque
        ArrayList<String[]> bloque = new ArrayList<String[]>();
        //bloque = simulacro.get(0);
        //String[] opciones = new String[5];
        //Code
        //String code = bloque.get(0).toString();
        //Enunciado
        //String enunciado = bloque.get(1).toString();
        //String[] Opciones
        //String opciones = bloque.get(0).toString();
        //Resultado
        //String resultado = bloque.get(0).toString();



        TextView txtCambiado = (TextView)findViewById(R.id.show_enunciado);
        txtCambiado.setText(enunciadostring);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view) {
                                                     NavUtils.navigateUpTo(Simulacro_1.this, IntentCompat.makeMainActivity(new ComponentName(Simulacro_1.this, Simulacro_1.class)));
                                                 }
                                             }

        );
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
