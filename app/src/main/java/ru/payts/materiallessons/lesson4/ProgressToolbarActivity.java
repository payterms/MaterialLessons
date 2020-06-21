package ru.payts.materiallessons.lesson4;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import ru.payts.materiallessons.R;


public class ProgressToolbarActivity extends AppCompatActivity {

    private static final String TAG = "ProgressToolbarActivity";

    private ProgressBar progressBarRound;
    private ProgressBar progressBarLine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresstoolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressBarRound = findViewById(R.id.progress_round_activity_progress);
        progressBarLine = findViewById(R.id.progress_line_activity_progress);

        progressBarLine.setMax(100);
        progressBarLine.setProgress(70);


    }

    public void show(View view) {
        progressBarLine.setVisibility(View.VISIBLE);
        progressBarRound.setVisibility(View.VISIBLE);
    }

    public void hide(View view) {
        progressBarLine.setVisibility(View.INVISIBLE);
        progressBarRound.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                Log.d(TAG, "Home button pressed ");
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
