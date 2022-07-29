package com.jane.go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*aqui eu indico a intenção de mudar de activity nessa aplicação que esta*/
    /*rodando=getApplicationContext, com a ação de ir para a Activity2*/
    public void chamarActivity2(View view) {
        Intent intent = new Intent(getApplicationContext(),Activity2.class);
        startActivity(intent);
    }

    public void chamarActivity6(View view) {
        Intent intent = new Intent(getApplicationContext(),Activity6.class);
        startActivity(intent);
    }
}