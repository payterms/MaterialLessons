package ru.payts.materiallessons.lesson7.tabs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ru.payts.materiallessons.R;
import ru.payts.materiallessons.lesson7.fragments.Fragment1;
import ru.payts.materiallessons.lesson7.fragments.Fragment2;
import ru.payts.materiallessons.lesson7.fragments.Fragment3;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment fragment1 = Fragment1.newInstance(null);
        Fragment fragment2 = Fragment2.newInstance(null);
        Fragment fragment3 = Fragment3.newInstance(null);

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter.addFragment(fragment1, "Jupiter");
        myAdapter.addFragment(fragment2, "Earth");
        myAdapter.addFragment(fragment3, "Saturn");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(myAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
}