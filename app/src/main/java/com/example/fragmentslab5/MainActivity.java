package com.example.fragmentslab5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    ListView listView;
    //List view





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List view
     // listView = findViewById(R.id.listView);
        //List view end

        bottomNavigationView = findViewById(R.id.bottom_nav_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        viewPager = findViewById(R.id.ViewPager);
        setUpAdapter(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNavigationView.getMenu().getItem(position).setChecked(true);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
    private void setUpAdapter(ViewPager viewPager){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPagerAdapter.addFragment(new HomeFragment());
        viewPagerAdapter.addFragment(new MealFragment());
        viewPagerAdapter.addFragment(new ProfileFragment());
        viewPagerAdapter.addFragment(new TrainerFragment());
        viewPager.setAdapter(viewPagerAdapter);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.nav_home:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.nav_meal:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.nav_profile:
                    viewPager.setCurrentItem(2);
                    return true;
                case R.id.nav_trainer:
                    viewPager.setCurrentItem(3);
                    return true;
                default:
                    return false;
            }
        }
    };
}