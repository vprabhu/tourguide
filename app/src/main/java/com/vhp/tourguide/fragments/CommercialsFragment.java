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
                "Gopalan Innovation Mall" , "Hours :10am - 10pm" , R.mipmap.gopolan_mall , Constants.ACTION_TIMINGS));
        mLocationArrayList.add(new Location(
                "Shoppers Stop" , "Hours :11am - 9pm" , R.mipmap.shopperstop , Constants.ACTION_TIMINGS));
        mLocationArrayList.add(new Location(
                "BrandFactory" , "Hours :11am - 9.30pm" , R.mipmap.brandfactory , Constants.ACTION_TIMINGS));
        mLocationArrayList.add(new Location(
                "Royal Meenakshi Mall" , "Hours :10am - 11pm" , R.mipmap.royal_meenakshi_mall , Constants.ACTION_TIMINGS));

        // initializes the array adapter with the arraylist
        LocationAdapter mLocationAdapter = new LocationAdapter(getActivity() , mLocationArrayList);

        // sets the adapter to listview
        mCommercialsListView.setAdapter(mLocationAdapter);

        return mRootView;
    }

}
