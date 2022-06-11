package com.example.fragmentslab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LegsActivity extends AppCompatActivity {

    ListView listView;
    String legsExercises[]={
            "Jefferson Squat                        3 x 13",
            "Seated Horizontal Leg Press                     3 x 15",
            "Lying Leg Curl                         3 x 14",
            "Dumbbell Goblet Squat                           4 x 20",
            "Barbell Deadlift                               2 x 11",
            "Barbell Squat                                 4 x 10",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        listView = findViewById(R.id.listLegs);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,legsExercises);
        listView.setAdapter(arr);

    }
    public void legs(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=91SvB3pbTJc");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}