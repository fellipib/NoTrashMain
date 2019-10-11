package com.example.notrashmain;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CondominioActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condominio);
        loadImg();

    }

    public void loadImg(){
        ImageView image = (ImageView) findViewById(R.id.imageView4);
        image.setImageResource(R.drawable.logo);
    }
}
