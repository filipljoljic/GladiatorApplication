package com.example.fragmentslab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BackActivity extends AppCompatActivity {

    ListView listView;
    String backExercises[]={
            "Cable Rope Pull Down         3 x 15",
            "Underhand Smith Machine Bent Over Row    3 x 10",
            "Dumbbell Pullover         3 x 12",
            "Single Arm Low Row Machine                          4 x 11",
            "Single Arm Cable Row                            5 x 5",
            "One Arm Dumbbell Row                           2 x 10",
            "Seated Cable Lat Pulldown                            2 x 10",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        listView = findViewById(R.id.listBack);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,backExercises);
        listView.setAdapter(arr);

    }
    public void back(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=4f0ykLwOFOE");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}