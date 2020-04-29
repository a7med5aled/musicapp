package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        ArrayList<singer> song = new ArrayList<singer>();
        song.add(new singer("Bhabek Wa7shteny", "Husien El Jasmi"));
        song.add(new singer("Elly Mishyo", "Ramy Gmal"));
        song.add(new singer("Zay Ma Enty", "Amro Diab"));
        song.add(new singer("Bhabek Wa7shteny", "Husien El Jasmi"));
        song.add(new singer("Bhabek Wa7shteny", "Husien El Jasmi"));
        singerAdapter singeradapter = new singerAdapter(this, song);
        ListView listView = (ListView) findViewById(R.id.song_view);
        listView.setAdapter(singeradapter);
    }
}
