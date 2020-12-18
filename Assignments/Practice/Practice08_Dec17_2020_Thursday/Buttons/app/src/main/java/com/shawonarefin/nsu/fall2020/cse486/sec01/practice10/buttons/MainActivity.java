package com.shawonarefin.nsu.fall2020.cse486.sec01.practice10.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button regularButton;
    private ImageButton imageButton;
    private Button borderlessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regularButton = findViewById(R.id.regular_button);
        regularButton.setOnClickListener(view -> {
            Toast.makeText(view.getContext(), "Clicked on Regular Button", Toast.LENGTH_SHORT).show();
        });
        regularButton.setOnLongClickListener(view -> {
            Toast.makeText(view.getContext(), "Long press on Regular Button", Toast.LENGTH_LONG).show();
            return true;
        });

        imageButton = findViewById(R.id.clock_button);
        imageButton.setOnClickListener(view -> {
            Toast.makeText(this, "Clicked on Image Button", Toast.LENGTH_SHORT).show();
        });
        imageButton.setOnLongClickListener(view -> {
            Toast.makeText(view.getContext(), "Long press on Image Button", Toast.LENGTH_LONG).show();
            return true;
        });

        borderlessButton = findViewById(R.id.borderless_button);
        borderlessButton.setOnClickListener(view -> {
            Toast.makeText(this, "Clicked on Flat Button", Toast.LENGTH_SHORT).show();
        });
        borderlessButton.setOnLongClickListener(view -> {
            Toast.makeText(view.getContext(), "Long press on Flat Button", Toast.LENGTH_LONG).show();
            return true;
        });
    }
}