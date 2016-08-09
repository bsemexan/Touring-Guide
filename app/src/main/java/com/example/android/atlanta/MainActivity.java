package com.example.android.atlanta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mountain = (TextView) findViewById(R.id.stone_mountain);

        mountain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mountainIntent = new Intent(MainActivity.this, StoneMountainActivity.class);

                startActivity(mountainIntent);
            }
        });

        TextView aquarium = (TextView) findViewById(R.id.aquarium);

        aquarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aquariumIntent = new Intent(MainActivity.this, AquariumActivity.class);

                startActivity(aquariumIntent);
            }
        });

        TextView lenox = (TextView) findViewById(R.id.lenox_mall);

        lenox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lenoxIntent = new Intent(MainActivity.this, LenoxActivity.class);

                startActivity(lenoxIntent);
            }
        });

        TextView museum = (TextView) findViewById(R.id.high_museum);

        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumIntent = new Intent(MainActivity.this, MuseumActivity.class);

                startActivity(museumIntent);
            }
        });
    }
}
