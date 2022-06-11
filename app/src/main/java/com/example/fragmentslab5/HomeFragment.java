package com.example.fragmentslab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment implements AdapterView.OnItemClickListener {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] training = {
                "Chest", "Back", "Legs", "Arms"
        };
        ListView listView = (ListView) view.findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, training);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> Parent, View view, int position, long id) {
        if (position == 0) {
            startActivity(new Intent(getActivity(), ChestActivity.class));
        }
        if (position == 1) {
            //Toast.makeText(getActivity(),"Back", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getActivity(), BackActivity.class));
        }
        if (position == 2) {
            //Toast.makeText(getActivity(), "Arm", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getActivity(), LegsActivity.class));
        }
        if (position == 3) {
            //Toast.makeText(getActivity(), "Arm", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getActivity(), ArmsActivity.class));
        }
    }
}
