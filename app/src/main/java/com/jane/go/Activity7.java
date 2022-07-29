package com.jane.go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
    }

    public void chamarActivity8(View view) {
        Intent intent = new Intent(getApplicationContext(),Activity8.class);
        startActivity(intent);
    }
}