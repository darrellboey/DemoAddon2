package com.example.a15056233.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    ImageView iv,iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       iv = (ImageView) findViewById(R.id.myZoomageView);
//        String imageUrl = "http://jsibbold.github.io/zoomage/";
//        Picasso.with(this).load(imageUrl).into(iv);


    }
}
