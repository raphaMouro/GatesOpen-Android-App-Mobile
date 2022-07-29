package com.jane.go;

import static com.jane.go.R.layout.activity_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_2);
    }

    public void chamarActivity3(View view){
        Intent intent = new Intent(getApplicationContext(),Activity3.class);
        startActivity(intent);
    }
}