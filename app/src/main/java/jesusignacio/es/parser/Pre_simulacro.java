package jesusignacio.es.parser;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jesusignacio on 30/06/15.
 */
public class Pre_simulacro extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pre_simulacro);

        toolbar = (Toolbar) findViewById(R.id.toolbar_main);



        Intent myIntent = getIntent(); // gets the previously created intent
        int intent_id = myIntent.getIntExtra("id", 0); // here 0 is the default value
        String intent_asignatura= myIntent.getStringExtra("asignatura"); // will return "SecondKeyValue"

        toolbar.setTitle(intent_asignatura);
        toolbar.setBackgroundColor(Color.RED);

        setSupportActionBar(toolbar);

        // this method show home button in toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavUtils.navigateUpTo(Pre_simulacro.this, IntentCompat.makeMainActivity(new ComponentName(Pre_simulacro.this, Pre_simulacro.class)));
            }
        });


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
