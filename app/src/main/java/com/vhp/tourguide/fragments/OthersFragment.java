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
public class OthersFragment extends Fragment {

    public OthersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mRootView = inflater.inflate(R.layout.fragment_commercials, container, false);

        ListView mCommercialsListView = (ListView) mRootView.findViewById(R.id.listview_commercials);

        ArrayList<Location> mLocationArrayList = new ArrayList<>();

        //construct the arraylist with others section's attractions
        mLocationArrayList.add(new Location(
                "Apollo Hospital" , "080 2630 4050" , R.mipmap.apollo, Constants.ACTION_CALL));
        mLocationArrayList.add(new Location(
                "Fortis Hospital" , "080662 14444" , R.mipmap.fortis , Constants.ACTION_CALL));
        mLocationArrayList.add(new Location(
                "Sri Chowdeshwari Devi Temple " , "4.7" , R.mipmap.chowdeshwari , Constants.ACTION_RATINGS));
        mLocationArrayList.add(new Location(
                "Meenakshi Sundareshwara Temple" , "4.8" , R.mipmap.meenakshi , Constants.ACTION_RATINGS));
        mLocationArrayList.add(new Location(
                "Reliance digital" , "Hours :10am - 10pm" , R.mipmap.reliance_digital, Constants.ACTION_TIMINGS));

        // initializes the array adapter with the arraylist
        LocationAdapter mLocationAdapter = new LocationAdapter(getActivity() , mLocationArrayList);

        // sets the adapter to listview
        mCommercialsListView.setAdapter(mLocationAdapter);

        return mRootView;
    }

}
