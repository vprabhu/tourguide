package com.vhp.tourguide.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.vhp.tourguide.R;
import com.vhp.tourguide.utils.Constants;

import java.util.ArrayList;

/**
 * Created by root on 29/3/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    private Context mContext;

    public LocationAdapter(Context context, ArrayList<Location> attractionList) {
        super(context, 0 , attractionList);
        mContext  = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null) {
            listItemView = LayoutInflater.from(
                    getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Location currentAttraction = getItem(position);

        TextView mTitleTextView = (TextView)listItemView.findViewById(R.id.textView_timings_title);
        final TextView mCallTextView;
        TextView mTimingsTextView;
        RatingBar mRatingBar;

        /**
         * switch statement to decide the action items for the respective attractions
         */
        switch (currentAttraction.getActionFlow()){
            case Constants.ACTION_CALL:
                mCallTextView = (TextView)listItemView.findViewById(R.id.textView_item_call);
                mCallTextView.setVisibility(View.VISIBLE);
                mCallTextView.setText(currentAttraction.getInformation());
                mCallTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri call = Uri.parse("tel:" + currentAttraction.getInformation());
                        Intent surf = new Intent(Intent.ACTION_DIAL, call);
                        mContext.startActivity(surf);
                    }
                });
                break;
            case Constants.ACTION_RATINGS:
                mRatingBar = (RatingBar)listItemView.findViewById(R.id.ratingBar_item);
                mRatingBar.setVisibility(View.VISIBLE);
                float ratingsFloat = Float.parseFloat(currentAttraction.getInformation());
                mRatingBar.setRating(ratingsFloat);
                break;
            case Constants.ACTION_TIMINGS:
                mTimingsTextView = (TextView)listItemView.findViewById(R.id.textView_timings_hours);
                mTimingsTextView.setVisibility(View.VISIBLE);
                mTimingsTextView.setText(currentAttraction.getInformation());
                break;
        }

        ImageView mImageView = (ImageView)listItemView.findViewById(R.id.image);
        /* sets the attraction name to title textview*/
        mTitleTextView.setText(currentAttraction.getTitle());
        /* set the image in the imageview */
        mImageView.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }


    @Override
    public int getPosition(Location item) {
        return super.getPosition(item);
    }
}
