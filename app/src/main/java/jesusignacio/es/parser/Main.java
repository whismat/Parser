package jesusignacio.es.parser;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;


public class Main extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {


    private String[] asignaturas;
    private ActionBarDrawerToggle mDrawerToggle_main;
    private DrawerLayout mDrawerLayout_main;
    private ListView mDrawerList_main;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        setupNavigationView();
        setupToolbar();

    }

    private void setupNavigationView() {

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        //Initializing NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(this);


    }

    private void setupToolbar() {

        toolbar = (Toolbar) findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        if (menuItem.isChecked()) {
            menuItem.setChecked(false);
        } else {
            menuItem.setChecked(true);
        }

        //Closing drawer on item click
        drawerLayout.closeDrawers();
        menuItem.setChecked(false);
        switch (menuItem.getItemId()) {

            case R.id.navigation_item_1:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 1).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_2:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 2).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_3:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 3).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_4:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 4).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_5:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 5).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_6:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 6).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_7:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 7).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_8:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 8).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_9:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 9).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_10:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 10).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_11:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 11).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_12:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 12).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_13:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 13).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_14:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 14).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_15:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 15).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_16:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 16).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_17:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 17).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_18:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 18).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_19:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 19).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_20:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 20).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_21:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 21).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_22:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 22).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_23:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 23).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_24:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 24).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_25:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 25).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_26:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 26).putExtra("asignatura", menuItem.getTitle()));
                break;
            case R.id.navigation_item_27:
                startActivity(new Intent(this, Pre_simulacro.class).putExtra("id", 27).putExtra("asignatura", menuItem.getTitle()));
                break;

        }

        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }
}
