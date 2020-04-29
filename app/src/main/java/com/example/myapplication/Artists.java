package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        ArrayList<String> artist = new ArrayList<String>();
        artist.add("Artist 1");
        artist.add("Artist 2");
        artist.add("Artist 3");
        artist.add("Artist 4");
        artist.add("Artist 5");
        GridView gridView = (GridView) findViewById(R.id.artists_view);
        TextView artistview = new TextView(this);
        artistview.setText(artist.get(0));
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artist);
        gridView.setAdapter(itemsAdapter);
    }
}
