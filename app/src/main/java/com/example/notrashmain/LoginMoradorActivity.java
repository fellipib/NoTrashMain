package com.example.notrashmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginMoradorActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginm);
        loadImg();

    }

    public void loadImg(){
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.logo);
    }

    public void telaCadastro(View view){
        Intent intent = new Intent(LoginMoradorActivity.this, CadMorActivity.class);
        startActivity(intent);

    }
}
