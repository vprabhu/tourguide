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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EduFragment extends Fragment {

    private View mRootView;
    private ListView mCommercialsListView;
    private ArrayList<Location> mEducationList = new ArrayList<>();

    public EduFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_commercials, container, false);

        mCommercialsListView = (ListView) mRootView.findViewById(R.id.listview_commercials);

        mEducationList.add(new Location("Christ University" ,  "080 4012 9100" , R.mipmap.gopolan_mall));
        mEducationList.add(new Location("IIMB" , "080 2699 3475" , R.mipmap.shopperstop));

        LocationAdapter mLocationAdapter = new LocationAdapter(getActivity() , mEducationList);

        mCommercialsListView.setAdapter(mLocationAdapter);

        return mRootView;
    }

}
