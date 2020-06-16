package ru.payts.materiallessons.lesson2;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import ru.payts.materiallessons.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void snackbarShort(View view) {
        Snackbar.make(view, "This is short time Snackbar message", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();
    }

    public void snackbarLong(View view) {
        Snackbar.make(view, "This is long time  Snackbar message", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void snackbarIndefinite(View view) {
        Snackbar.make(view, "This is indefinite time Snackbar message", Snackbar.LENGTH_INDEFINITE)
                .setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Respond to the click, such as by undoing the modification that caused
                // this message to be displayed
            }
        }).show();
    }

    public void snackbarAction(View view) {
        Snackbar.make(view, "This is Snackbar with action", Snackbar.LENGTH_INDEFINITE)
                .setAction("RUN", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Respond to the click, such as by undoing the modification that caused
                        // this message to be displayed
                    }
                }).show();
    }


}