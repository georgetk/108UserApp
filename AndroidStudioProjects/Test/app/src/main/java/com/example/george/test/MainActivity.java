package com.example.george.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView ambulance;
    ImageView fire;
    ImageView police;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ambulance = (ImageView) findViewById(R.id.ambulance_img);
        ambulance.setImageResource(R.drawable.ambulance);
        fire = (ImageView) findViewById(R.id.fire_img);
        fire.setImageResource(R.drawable.fire);
        police = (ImageView) findViewById(R.id.police_img);
        police.setImageResource(R.drawable.police);
    }

}
