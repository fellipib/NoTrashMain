package com.example.notrashmain;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MoradorActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morador);

        loadImg();

    }

    public void loadImg(){
        ImageView image = (ImageView) findViewById(R.id.imageView3);
        image.setImageResource(R.drawable.logo);
    }
}
