package com.example.mohamedelwarraky.miwok;


import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Displays a {@link ViewPager} where each page shows a different day of the week.
 */

public class MainActivity extends AppCompatActivity {

    /*
    The reference value of time
     */
    private static long back_pressed;
    /*
    Toast messege to know if user press back button
     */
    Toast mToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter mPagerAdapter = new SimpleFragmentPagerAdapter(this ,getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(mPagerAdapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }


    @Override
        public void onBackPressed () {
            if (back_pressed + 1500 > System.currentTimeMillis()) {
                super.onBackPressed();
                // Cancel toast messege when user exit the app
                mToast.cancel();
            } else {
                //show toast messege when user press back once
                mToast = Toast.makeText(MainActivity.this, "Press once again to exit!", Toast.LENGTH_SHORT);
                // Show toast messege
                mToast.show();
            }
            back_pressed = System.currentTimeMillis();
        }

    }
