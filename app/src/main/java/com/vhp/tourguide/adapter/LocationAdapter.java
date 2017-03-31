package com.vhp.tourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vhp.tourguide.R;

import java.util.ArrayList;

/**
 * Created by root on 29/3/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> attractionList) {
        super(context, 0 , attractionList);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null) {
            listItemView = LayoutInflater.from(
                    getContext()).inflate(R.layout.list_item, parent, false);
        }
        Location currentAttraction = getItem(position);

        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.textView_miwok_word);
        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.textView_english_word);
        ImageView mImageView = (ImageView)listItemView.findViewById(R.id.image);

        miwokTextView.setText(currentAttraction.getTitle());
        defaultTextView.setText(currentAttraction.getInformation());
        mImageView.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }


    @Override
    public int getPosition(Location item) {
        return super.getPosition(item);
    }
}
