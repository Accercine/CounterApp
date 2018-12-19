package com.example.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countervalue;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countervalue = (TextView) findViewById(R.id.count);
    }

    public void countpp (View view) {
        count++;
        countervalue.setText(Integer.toString(count));
    }
}
