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
        ViewHolder holder = null;

        if(convertView==null) {
            convertView = LayoutInflater.from(
                    getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.mTitleTextView = (TextView)convertView.findViewById(R.id.textView_timings_title);
            holder.mImageView = (ImageView)convertView.findViewById(R.id.image);
        }else {

        }
        final Location currentAttraction = getItem(position);

        /**
         * switch statement to decide the action items for the respective attractions
         */
        switch (currentAttraction.getActionFlow()){
            case Constants.ACTION_CALL:
                holder.mCallTextView = (TextView)convertView.findViewById(R.id.textView_item_call);
                holder.mCallTextView.setVisibility(View.VISIBLE);
                holder.mCallTextView.setText(currentAttraction.getInformation());
                holder.mCallTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri call = Uri.parse("tel:" + currentAttraction.getInformation());
                        Intent surf = new Intent(Intent.ACTION_DIAL, call);
                        mContext.startActivity(surf);
                    }
                });
                break;
            case Constants.ACTION_RATINGS:
                holder.mRatingBar = (RatingBar)convertView.findViewById(R.id.ratingBar_item);
                holder.mRatingBar.setVisibility(View.VISIBLE);
                float ratingsFloat = Float.parseFloat(currentAttraction.getInformation());
                holder.mRatingBar.setRating(ratingsFloat);
                break;
            case Constants.ACTION_TIMINGS:
                holder.mTimingsTextView = (TextView)convertView.findViewById(R.id.textView_timings_hours);
                holder.mTimingsTextView.setVisibility(View.VISIBLE);
                holder.mTimingsTextView.setText(currentAttraction.getInformation());
                break;
        }

        /* sets the attraction name to title textview*/
        holder.mTitleTextView.setText(currentAttraction.getTitle());
        /* set the image in the imageview */
        holder.mImageView.setImageResource(currentAttraction.getImageResourceId());

        return convertView;
    }


    @Override
    public int getPosition(Location item) {
        return super.getPosition(item);
    }

    static class ViewHolder {
        private TextView mTitleTextView;
        private TextView mCallTextView;
        private TextView mTimingsTextView;
        private ImageView mImageView;
        private RatingBar mRatingBar;
    }
}
