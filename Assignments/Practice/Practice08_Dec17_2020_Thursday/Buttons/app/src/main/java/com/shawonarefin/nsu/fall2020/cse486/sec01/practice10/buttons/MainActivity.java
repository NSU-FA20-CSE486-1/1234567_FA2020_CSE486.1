package com.shawonarefin.nsu.fall2020.cse486.sec01.practice10.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button regularButton;
    private ImageButton imageButton;
    private Button borderlessButton;
    private TextView displayActionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayActionTextView = findViewById(R.id.display_action_textview);

        regularButton = findViewById(R.id.regular_button);
        regularButton.setOnClickListener(view -> {
            displayActionTextView.setText("Clicked on Regular Button");
        });
        regularButton.setOnLongClickListener(view -> {
            displayActionTextView.setText("Long press on Regular Button");
            return true;
        });
        regularButton.setOnTouchListener((view, motionEvent) -> {
            boolean returnValue = false;
            switch (motionEvent.getAction()){
                case MotionEvent.ACTION_MOVE:
                    displayActionTextView.setText("Regular button touched : " + motionEvent.ACTION_MOVE);
                    returnValue = true;
                    break;
                default:
                    returnValue = false;
            }

            return returnValue;
        });

        imageButton = findViewById(R.id.clock_button);
        imageButton.setOnClickListener(view -> {
            displayActionTextView.setText("Clicked on Image Button");
        });
        imageButton.setOnLongClickListener(view -> {
            displayActionTextView.setText("Long press on Image Button");
            return true;
        });
        imageButton.setOnTouchListener((view, motionEvent) -> {
            boolean returnValue = false;
            switch (motionEvent.getAction()){
                case MotionEvent.ACTION_MOVE:
                    displayActionTextView.setText("Image button touched : " + motionEvent.ACTION_MOVE);
                    returnValue = true;
                    break;
                default:
                    returnValue = false;
            }

            return returnValue;
        });

        borderlessButton = findViewById(R.id.borderless_button);
        borderlessButton.setOnClickListener(view -> {
            displayActionTextView.setText("Clicked on Flat Button");
        });
        borderlessButton.setOnLongClickListener(view -> {
            displayActionTextView.setText("Borderless button long pressed");
            return true;
        });
        borderlessButton.setOnTouchListener((view, motionEvent) -> {
            boolean returnValue = false;
            switch (motionEvent.getAction()){
                case MotionEvent.ACTION_MOVE:
                    displayActionTextView.setText("Borderless button touched : " + motionEvent.ACTION_MOVE);
                    returnValue = true;
                    break;
                default:
                    returnValue = false;
            }

            return returnValue;
        });
    }
}