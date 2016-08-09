package com.example.android.atlanta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by beryy on 8/7/16.
 */
public class AquariumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Georgia Aquarium", "The largest aquarium in the western hemisphere",R.drawable.ic_georgia_aquarium));

        TourAdapter adapter = new TourAdapter(this, tours,R.color.category_one);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);

    }
}
