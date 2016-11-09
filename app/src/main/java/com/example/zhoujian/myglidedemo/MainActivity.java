package com.example.zhoujian.myglidedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class MainActivity extends Activity {

    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image);

        Glide.with(this).load("http://img15.3lian.com/2015/a1/16/d/202.jpg").into(image);


    }

}
