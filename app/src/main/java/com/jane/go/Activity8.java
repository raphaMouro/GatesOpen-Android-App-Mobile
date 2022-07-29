package com.jane.go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);
    }

    public void chamarActivity2(View view) {
        Intent intent = new Intent(getApplicationContext(),Activity2.class);
        startActivity(intent);
    }

    public void chamarActivity9(View view) {
        Intent intent = new Intent(getApplicationContext(),Activity9.class);
        startActivity(intent);
    }

}