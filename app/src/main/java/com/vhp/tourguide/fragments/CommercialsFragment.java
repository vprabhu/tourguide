package com.vhp.tourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.vhp.tourguide.R;
import com.vhp.tourguide.adapter.Location;
import com.vhp.tourguide.adapter.LocationAdapter;
import com.vhp.tourguide.utils.Constants;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommercialsFragment extends Fragment {

    public CommercialsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mRootView = inflater.inflate(R.layout.fragment_commercials, container, false);

        ListView mCommercialsListView = (ListView) mRootView.findViewById(R.id.listview_commercials);

        ArrayList<Location> mLocationArrayList = new ArrayList<>();

        //construct the arraylist with commercial section's attractions
        mLocationArrayList.add(new Location(
                getResources().getString(R.string.info_attraction_gopalan_mall_name),
                getResources().getString(R.string.info_attraction_gopalan_mall) ,
                R.drawable.gopalan_mall ,
                Constants.ACTION_TIMINGS));
        mLocationArrayList.add(new Location(
                getResources().getString(R.string.info_attraction_shoppersstop_name) ,
                getResources().getString(R.string.info_attraction_shoppersstop) ,
                R.drawable.shopperstop ,
                Constants.ACTION_TIMINGS));
        mLocationArrayList.add(new Location(
                getResources().getString(R.string.info_attraction_brand_factory_name),
                getResources().getString(R.string.info_attraction_brand_factory) ,
                R.drawable.brandfactory ,
                Constants.ACTION_TIMINGS));
        mLocationArrayList.add(new Location(
                getResources().getString(R.string.info_attraction_meenakshi_mall_name),
                getResources().getString(R.string.info_attraction_meenakshi_mall),
                R.drawable.royal_meenakshi_mall ,
                Constants.ACTION_TIMINGS));

        // initializes the array adapter with the arraylist
        LocationAdapter mLocationAdapter = new LocationAdapter(getActivity() , mLocationArrayList);

        // sets the adapter to listview
        mCommercialsListView.setAdapter(mLocationAdapter);

        return mRootView;
    }

}
