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
public class EduFragment extends Fragment {


    public EduFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mRootView = inflater.inflate(R.layout.fragment_commercials, container, false);

        ListView mCommercialsListView = (ListView) mRootView.findViewById(R.id.listview_commercials);

        ArrayList<Location> mEducationList = new ArrayList<>();

        //construct the arraylist with Educational section's attractions
        mEducationList.add(new Location(
                getResources().getString(R.string.info_attraction_christ_name) ,
                getResources().getString(R.string.info_attraction_christ),
                R.drawable.christ_univ,
                Constants.ACTION_CALL));
        mEducationList.add(new Location(
                getResources().getString(R.string.info_attraction_iimb_name),
                getResources().getString(R.string.info_attraction_iimb) ,
                R.drawable.iimb,
                Constants.ACTION_CALL));

        // initializes the array adapter with the arraylist
        LocationAdapter mLocationAdapter = new LocationAdapter(getActivity() , mEducationList);

        // sets the adapter to listview
        mCommercialsListView.setAdapter(mLocationAdapter);

        return mRootView;
    }

}
