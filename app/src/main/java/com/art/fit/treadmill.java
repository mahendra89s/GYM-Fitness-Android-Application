package com.art.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class treadmill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treadmill);
        TextView textView = findViewById(R.id.treadmill1);
        textView.setText(R.string.treadmill1);
    }
    public void startexercise(View view) {
        Intent intent=new Intent(getApplicationContext(),startexercise.class);
        startActivity(intent);
    }
}
