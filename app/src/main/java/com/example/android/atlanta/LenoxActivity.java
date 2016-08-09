package com.example.android.atlanta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by beryy on 8/7/16.
 */
public class LenoxActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Lenox Square", "Upscale complex featuring high-end department stores"));

        TourAdapter adapter = new TourAdapter(this, tours,R.color.category_two);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);

    }
}
