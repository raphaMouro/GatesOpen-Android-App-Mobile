package com.jane.go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void chamarActivity4(View view) {
        Intent intent = new Intent(getApplicationContext(),Activity4.class);
        startActivity(intent);
    }

    public void chamarActivity7(View view) {
        Intent intent = new Intent(getApplicationContext(),Activity7.class);
        startActivity(intent);
    }
}
