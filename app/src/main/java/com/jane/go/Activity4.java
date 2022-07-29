package com.jane.go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void chamarActivity5(View view) {
        Intent intent = new Intent(getApplicationContext(),Activity5.class);
        startActivity(intent);
    }

    public void chamarActivity4(View view) {
    }
}