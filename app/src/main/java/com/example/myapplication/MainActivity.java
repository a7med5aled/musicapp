package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowplaying = (TextView) findViewById(R.id.Now_Plaing);
        nowplaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplayingIntent = new Intent(MainActivity.this, Nowplaying.class);
                startActivity(nowplayingIntent);
            }
        });

        TextView song = (TextView) findViewById(R.id.Songs);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(songIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.Artist);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistIntent);
            }
        });
    }
}
