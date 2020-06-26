package ru.payts.materiallessons.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import ru.payts.materiallessons.R;

public class ThemeActivity extends AppCompatActivity {


    private static final String TAG = "ThemeActivity";
    public static final String EXTRA_THEME = "EXTRA_THEME";

    private int themeNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");

        if(savedInstanceState != null){

            themeNumber = savedInstanceState.getInt(EXTRA_THEME);

            switch (themeNumber) {
                case 0:
                    setTheme(R.style.AppThemeRed);
                    break;
                case 1:
                    setTheme(R.style.AppThemeYellow);
                    break;
                case 2:
                    setTheme(R.style.AppThemeGreen);
                    break;
            }
        }

        initActivity();
    }

    private void initActivity() {
        setContentView(R.layout.activity_theme);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.red:
                themeNumber = 0;
                break;
            case R.id.yellow:
                themeNumber = 1;
                break;
            case R.id.green:
                themeNumber = 2;
                break;

        }
        recreate();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(EXTRA_THEME, themeNumber);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.theme_menu, menu);
        return true;
    }
}