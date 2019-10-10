package com.example.notrashmain;

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

    public void loginMorador(View view){
        Intent intent = new Intent(MainActivity.this, LoginMoradorActivity.class);
        startActivity(intent);

    }

    public void loginCondominio(View view){
        Intent intent = new Intent(MainActivity.this, LoginCondominioActivity.class);
        startActivity(intent);

    }
}
