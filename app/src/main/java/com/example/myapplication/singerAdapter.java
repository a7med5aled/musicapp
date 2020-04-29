package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class singerAdapter extends ArrayAdapter<singer> {
    private static final String LOG_TAG = singerAdapter.class.getSimpleName();

    public singerAdapter(Activity context, ArrayList<singer> singer) {
        super(context, 0, singer);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.simple_list_item_2, parent, false);
        }
        singer currentsinger = getItem(position);
        TextView namesong = (TextView) listItemView.findViewById(R.id.name_song);
        namesong.setText(currentsinger.getSongname());
        TextView namesinger = (TextView) listItemView.findViewById(R.id.name_singer);
        namesinger.setText(currentsinger.getSingername());
        return listItemView;

    }
}
