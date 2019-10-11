package com.example.notrashmain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CadMorActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadm);
        loadImg();

    }

    public void loadImg(){
        ImageView image = (ImageView) findViewById(R.id.imageView5);
        image.setImageResource(R.drawable.logo);
    }
}
