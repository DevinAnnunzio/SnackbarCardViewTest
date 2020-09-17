package com.devinannunzio.android.snackbarcardviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout parent;
    private Button btnShowSnack;
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parent = findViewById(R.id.parent);
        btnShowSnack = findViewById(R.id.button);
        cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "HEYO card clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnShowSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar();
            }
        });
    }

    private void showSnackBar() {
        Snackbar.make(parent,"This is the snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retry clicked", Toast.LENGTH_SHORT).show();
                    }
                })
//                .setActionTextColor(getResources().getColor(R.color.colorPrimary))
                .setActionTextColor(Color.GREEN)
                .setTextColor(Color.CYAN)
                .show();
    }
}