package com.example.notrashmain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginCondominioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginc);
    }

    public void telaCadastro(View view){
        Intent intent = new Intent(LoginCondominioActivity.this, CadCondActivity.class);
        startActivity(intent);

    }

    public void doLoginCondominio(View view){
        Intent intent = new Intent(LoginCondominioActivity.this, CondominioActivity.class);
        startActivity(intent);

    }
}
