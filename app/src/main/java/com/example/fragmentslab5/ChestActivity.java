package com.example.fragmentslab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChestActivity extends AppCompatActivity {

    ListView listView;
    String chestExercises[]={
            "Barbell Bench Press         3 x 10",
            "Dumbbell Bench Press    3 x 10",
            "Incline Bench Press          3 x 12",
            "Push-ups                            4 x 20",
            "Chest Fly                            2 x 13",
            "High-Cable Low Crossover             3 x 10"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        listView = findViewById(R.id.listChest);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,chestExercises);
        listView.setAdapter(arr);

    }
    public void onAddFunctionChest(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=o72LZkRwsM8");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}