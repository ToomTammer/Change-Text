package com.example.myfirstapp;

import static android.view.MotionEvent.actionToString;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    GestureDetectorCompat detectorCompat;

    TextView textView;
    TextView textView4;
    Button button;

    Activity activity;
    MenuItem itemThai;
    MenuItem itemEnglish;
    Menu optionMenu;

    Button buttonSubAc1;

    String DEBUG_TAG = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
        textView = findViewById(R.id.textView);
        textView4 = findViewById(R.id.textView4);
        button = findViewById(R.id.button);
        buttonSubAc1 = findViewById(R.id.buttonSubAc1);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if(this.detectorCompat.onTouchEvent(event)){
            return true;
        }

        return  super.onTouchEvent(event);
    }

    public void buttonClicked(View v) {
        if (button.getText() == "Switch") {
            textView.setText("Hello CMM 346 - 2/2564");
            textView4.setText("Mobile Application Development I");
            //textView.setTypeface(null, Typeface.ITALIC);
            button.setText("Switched");
            Toast.makeText(this, "You press Switched", Toast.LENGTH_SHORT).show();
        } else {
            textView.setText("Mobile Application Development I");
            textView4.setText("Hello CMM 346 - 2/2564");
            //textView.setTypeface(null, Typeface.NORMAL);
            button.setText("Switch");
            Toast.makeText(this, "You press Switched", Toast.LENGTH_LONG).show();
        }
    }

    public void buttonClicked2(View v) {
        if (buttonSubAc1.getText() == "Change Color") {
            textView.setTextColor(Color.BLUE);
            textView4.setTextColor(Color.BLUE);
            buttonSubAc1.setText("Changed Color");
            Toast.makeText(this, "You press Changed Color", Toast.LENGTH_SHORT).show();
        } else {
            textView.setTextColor(Color.BLACK);
            textView4.setTextColor(Color.BLACK);
            buttonSubAc1.setText("Change Color");
            Toast.makeText(this, "You press Changed Color", Toast.LENGTH_LONG).show();
        }
    }



}
