package jesusignacio.es.parser;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Main extends AppCompatActivity {

    private String[] asignaturas;
    private ActionBarDrawerToggle mDrawerToggle_main;
    private DrawerLayout mDrawerLayout_main;
    private ListView mDrawerList_main;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);


        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //Añado el Drawer Layout
        asignaturas = getResources().getStringArray(R.array.asignaturas);
        mDrawerLayout_main = (DrawerLayout) findViewById(R.id.drawer_layout_main);
        mDrawerList_main = (ListView) findViewById(R.id.left_listview_main);
        mDrawerList_main.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, asignaturas));


        mDrawerToggle_main = new ActionBarDrawerToggle(this,
                mDrawerLayout_main,
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

        mDrawerLayout_main.setDrawerListener(mDrawerToggle_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mDrawerToggle_main.syncState();

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
