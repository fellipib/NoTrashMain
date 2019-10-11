package com.example.notrashmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   loadImg();

    }

    public void loadImg(){
        ImageView image = (ImageView) findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.logo);
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
