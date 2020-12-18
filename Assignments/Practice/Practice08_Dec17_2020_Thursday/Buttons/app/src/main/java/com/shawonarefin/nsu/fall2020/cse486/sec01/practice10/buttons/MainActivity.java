package com.shawonarefin.nsu.fall2020.cse486.sec01.practice10.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleImageButton(View view){
        Toast.makeText(this, "Clicked on Image Button", Toast.LENGTH_SHORT).show();
    }

    public void handleFlatButton(View view){
        Toast.makeText(this, "Clicked on Flat Button", Toast.LENGTH_SHORT).show();
    }
}