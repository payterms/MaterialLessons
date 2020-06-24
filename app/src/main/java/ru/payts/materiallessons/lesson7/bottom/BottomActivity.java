package ru.payts.materiallessons.lesson7.bottom;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import ru.payts.materiallessons.R;
import ru.payts.materiallessons.lesson7.fragments.Fragment1;
import ru.payts.materiallessons.lesson7.fragments.Fragment2;
import ru.payts.materiallessons.lesson7.fragments.Fragment3;


public class BottomActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        replaceFragment(new Fragment1());

        BottomNavigationView navView = findViewById(R.id.navigation_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    replaceFragment(new Fragment1());
                    return true;
                case R.id.navigation_dashboard:
                    replaceFragment(new Fragment2());
                    return true;
                case R.id.navigation_notifications:
                    replaceFragment(new Fragment3());
                    return true;
            }
            return false;
        }
    };

    private void replaceFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();

    }

}
