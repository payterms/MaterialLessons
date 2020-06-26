package ru.payts.materiallessons.lesson3;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import ru.payts.materiallessons.R;

public class ButtonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
    }
/*Создать ButtonsActivity.
Сделать в ней кнопку flat button в виде текста, flat button с границей,
raised button, raised button с фоном,
float action button
* */
    public void flatButton(View view) {
        Snackbar.make(view, "Hello from Flat button", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();
    }

    public void raisedButton(View view) {
        Snackbar.make(view, "Hello from Raised button", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void FAB(View view) {
        Snackbar.make(view, "Confirms that FAB is cool button! ", Snackbar.LENGTH_INDEFINITE)
                .setAction("CONFIRM", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Respond to the click, such as by undoing the modification that caused
                // this message to be displayed
            }
        }).show();
    }

    public void snackbarAction(View view) {
        Snackbar.make(view, "Confirms that FAB is cool button! ", Snackbar.LENGTH_INDEFINITE)
                .setAction("RUN", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Respond to the click, such as by undoing the modification that caused
                        // this message to be displayed
                    }
                }).show();
    }


}