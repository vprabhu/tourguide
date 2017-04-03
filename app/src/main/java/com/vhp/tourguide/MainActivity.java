package com.vhp.tourguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vhp.tourguide.adapter.TourPagerAdapter;

public class MainActivity extends AppCompatActivity {

    // viewpager variable to hold the attractions in fragment
    private ViewPager mRootViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // typecasting the viewpager
        mRootViewPager = (ViewPager) findViewById(R.id.viewpager_root);

        // adapter to set the fragments for different relevant attraction
        TourPagerAdapter mTourPagerAdapter = new TourPagerAdapter(getSupportFragmentManager());


        // set the adapter to view pager
        mRootViewPager.setAdapter(mTourPagerAdapter);
    }

}
