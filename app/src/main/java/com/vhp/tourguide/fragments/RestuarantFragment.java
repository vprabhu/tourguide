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
public class RestuarantFragment extends Fragment {

    private View mRootView;
    private ListView mCommercialsListView;
    private ArrayList<Location> mLocationArrayList = new ArrayList<>();

    public RestuarantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_commercials, container, false);

        mCommercialsListView = (ListView) mRootView.findViewById(R.id.listview_commercials);

        mLocationArrayList.add(new Location("McDonalds" , "Hours :11am - 11pm" , R.mipmap.mcdonalds));
        mLocationArrayList.add(new Location("Madhuloka Liquor Boutique " , "Hours :10am - 10.30pm" , R.mipmap.madhu));
        mLocationArrayList.add(new Location("Pizza Hut" , "Hours :11am - 11pm" , R.mipmap.pizza_hut));
        mLocationArrayList.add(new Location("Dominos Pizza" , "Hours :11am - 11pm" , R.mipmap.dominos_pizza));

        LocationAdapter mLocationAdapter = new LocationAdapter(getActivity() , mLocationArrayList);

        mCommercialsListView.setAdapter(mLocationAdapter);

        return mRootView;
    }

}
