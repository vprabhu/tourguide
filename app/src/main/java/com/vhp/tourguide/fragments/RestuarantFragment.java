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
public class RestuarantFragment extends Fragment {

    public RestuarantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mRootView = inflater.inflate(R.layout.fragment_commercials, container, false);

        ListView  mCommercialsListView = (ListView) mRootView.findViewById(R.id.listview_commercials);

        ArrayList<Location> mLocationArrayList = new ArrayList<>();

        //construct the arraylist with Restuarant section's attractions
        mLocationArrayList.add(
                new Location(
                        "McDonalds" ,
                        "Hours :11am - 11pm" ,
                        R.mipmap.mcdonalds ,
                        Constants.ACTION_TIMINGS));
        mLocationArrayList.add(
                new Location(
                        "Madhuloka Liquor Boutique " ,
                        "Hours :10am - 10.30pm" ,
                        R.mipmap.madhu,
                        Constants.ACTION_TIMINGS));
        mLocationArrayList.add(
                new Location(
                        "Pizza Hut" ,
                        "Hours :11am - 11pm" ,
                        R.mipmap.pizza_hut,
                        Constants.ACTION_TIMINGS));
        mLocationArrayList.add(
                new Location(
                        "Dominos Pizza" ,
                        "Hours :11am - 11pm" ,
                        R.mipmap.dominos_pizza,
                        Constants.ACTION_TIMINGS));

        // initializes the array adapter with the arraylist
        LocationAdapter mLocationAdapter = new LocationAdapter(getActivity() , mLocationArrayList);

        // sets the adapter to listview
        mCommercialsListView.setAdapter(mLocationAdapter);

        return mRootView;
    }

}
