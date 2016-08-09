package com.example.android.atlanta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by beryy on 8/7/16.
 */
public class StoneMountainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Stone Mountain Park","Vast, scenic park with activities, golf," +
                " lodging & a cable car ride to a historic, carved peak."));

        TourAdapter adapter = new TourAdapter(this, tours,R.color.category_two);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);

    }
}
