package com.example.fragmentslab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArmsActivity extends AppCompatActivity {

    ListView listView;
    String armsExercises[]={
            "EZ Barbell Curls        3 x 13",
            "Dumbbell Curls    3 x 10",
            "Single Arm Dumbbell Hammer Curl         3 x 10",
            "Standing Cable Curls                           4 x 15",
            "High Cable Curls                           2 x 10",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);
        listView = findViewById(R.id.listArms);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,armsExercises);
        listView.setAdapter(arr);

    }
    public void arms(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=lzpd0pBIrgI");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}