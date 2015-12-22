package jesusignacio.es.parser;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.widget.GridView;


public class PagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = Global.tamano_simulacro;

    private String tabTitles[] = new String[Global.tamano_simulacro];

    private GridView gridView;

    public void populatetabTitles(){
        for(int i=0; i< Global.tamano_simulacro; i++){
            tabTitles[i]= "Pregunta " + (i+1);
        }
    }
    private Context context;

    public PagerAdapter(FragmentManager fm, Context context, GridView gridView) {
        super(fm);
        this.context = context;
        this.gridView = gridView;
        populatetabTitles();
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}