package com.example.fragmentslab5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MealFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.meal_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String[] training = {
                "Air Fried Cajun Drumsticks     Calories:200",
                "Garlic Spinach & Mushrooms          Calories:220",
                "Egg Niçoise salad      Calories:383",
                "Slow-cooker chicken casserole   Calories:382",
                "Poached eggs with broccoli, tomatoes & wholemeal flatbread   Calories:383",
                "Greek-style roast fish   Calories:388",
                "Barbecued squid salad   Calories:374"
        };
        ListView listView = (ListView) view.findViewById(R.id.listmeals);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, training);
        listView.setAdapter(adapter);


    }
}




