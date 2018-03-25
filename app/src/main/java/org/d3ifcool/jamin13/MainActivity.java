package org.d3ifcool.jamin13;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */

    // private SectionsPagerAdapter mSectionsPagerAdapter;


    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.container);


        final FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new ManualFragment();
                    case 1:
                        return new AutoFragment();
                    case 2:
                        return new ActivityFragment();
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public long getItemId(int position) {
                return super.getItemId(position);
            }

            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "Home";
                    case 1:
                        return "Auto";
                    case 2:
                        return "Base On Activity";
                }
                return null;
            }
        };


        viewPager.setAdapter(adapter);
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
    }

    public void activate (View view) {
        Button on = (Button) findViewById(R.id.on);
        Button off = (Button) findViewById(R.id.off);
        final ImageView imgEmot = (ImageView) findViewById(R.id.buttonpower);


        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgEmot.setImageResource(R.drawable.auto);
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgEmot.setImageResource(R.drawable.off);
            }
        });
    }


//    @Override
//    public void onBackPressed() {
//
//        finishAffinity();
//        System.exit(0);
//    }


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
            startActivity(new Intent(MainActivity.this, ProfilActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}