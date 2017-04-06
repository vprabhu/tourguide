package com.vhp.tourguide.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.vhp.tourguide.R;
import com.vhp.tourguide.fragments.CommercialsFragment;
import com.vhp.tourguide.fragments.EduFragment;
import com.vhp.tourguide.fragments.OthersFragment;
import com.vhp.tourguide.fragments.RestuarantFragment;

/**
 * Created by root on 29/3/17.
 */

public class TourPagerAdapter extends FragmentStatePagerAdapter {

    // total number of fragments
    private final int NUM_OF_PAGES = 4;
    private Context mContext;

    public TourPagerAdapter(FragmentManager fm , Context ctxParam) {
        super(fm);
        mContext = ctxParam;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            // show commercial page
            return new CommercialsFragment();
        }else if(position == 1){
            // show restaurant page
            return new RestuarantFragment();
        }else if(position == 2){
            // show Educational institutions
            return new EduFragment();
        }else {
            //show Others page
            return new OthersFragment();
        }
    }

    @Override
    public int getCount() {
        return NUM_OF_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getResources().getString(R.string.title_commercials);
        }else if(position == 1){
            return mContext.getResources().getString(R.string.title_dine);
        }else if(position == 2){
            return mContext.getResources().getString(R.string.title_educational);
        }else if(position == 3){
            return mContext.getResources().getString(R.string.title_others);
        }
        return super.getPageTitle(position);
    }
}
