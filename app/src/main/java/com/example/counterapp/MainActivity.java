package com.example.counterapp;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countervalue;
    int count = 0;
    EditText txtname;
    String jumpm;
    int jump;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.main_activity_background_color));
        countervalue = (TextView) findViewById(R.id.count);
        txtname = (EditText) findViewById(R.id.jumpvalue);
        animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
    }

    protected boolean isEmpty(EditText editText) {
        return (editText.getText().toString().equals(""));
    }

    public void countpp (View view) {
        count++;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void countmm (View view) {
        count--;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void countreset (View view) {
        count = 0;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void a5 (View view) {
        count = count + 5;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void s5 (View view) {
        count = count - 5;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void a10 (View view) {
        count = count + 10;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void s10 (View view) {
        count = count - 10;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void a100 (View view) {
        count = count + 100;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void s100 (View view) {
        count = count - 100;
        countervalue.startAnimation(animation);
        countervalue.setText(Integer.toString(count));
    }

    public void jumpby (View view) {
        if (!isEmpty(txtname)) {
            jumpm = txtname.getText().toString();
            jump = Integer.valueOf(jumpm);
            count = count + jump;
            countervalue.startAnimation(animation);
            countervalue.setText(Integer.toString(count));
        }
    }

    public void jumpto (View view) {
        if (!isEmpty(txtname)) {
            jumpm = txtname.getText().toString();
            jump = Integer.valueOf(jumpm);
            count = jump;
            countervalue.startAnimation(animation);
            countervalue.setText(Integer.toString(count));
        }
    }
}