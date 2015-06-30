package jesusignacio.es.parser;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
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

/**
 * Created by jesusignacio on 30/06/15.
 */
public class Pre_simulacro extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pre_simulacro);

        toolbar = (Toolbar) findViewById(R.id.toolbar_main);

        Intent myIntent = getIntent(); // gets the previously created intent
        int intent_id = myIntent.getIntExtra("id", 0); // here 0 is the default value
        String intent_asignatura= myIntent.getStringExtra("asignatura"); // will return "SecondKeyValue"

        toolbar.setTitle(intent_asignatura);
        ActionButton actionButton = (ActionButton) findViewById(R.id.pre_simulacro_action_button);

        actionButton.setOnTouchListener(new ActionButton.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                // have same code as onTouchEvent() (for the Activity) above

                NavUtils.navigateUpTo(Pre_simulacro.this, IntentCompat.makeMainActivity(new ComponentName(Pre_simulacro.this, Pre_simulacro.class)));
                ;

                return true;
            }
        });

            actionButton.setRippleEffectEnabled(true);


            intent_id++;
            if(intent_id==1)

            {
                toolbar.setBackgroundColor(getResources().getColor(R.color.color_1));
                actionButton.setButtonColorPressed(getResources().getColor(R.color.color_1));
                actionButton.setButtonColor(getResources().getColor(R.color.color_1));
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

            setSupportActionBar(toolbar);

            // this method show home button in toolbar
            getSupportActionBar()

            .

            setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                NavUtils.navigateUpTo(Pre_simulacro.this, IntentCompat.makeMainActivity(new ComponentName(Pre_simulacro.this, Pre_simulacro.class)));
            }
            }

            );

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
