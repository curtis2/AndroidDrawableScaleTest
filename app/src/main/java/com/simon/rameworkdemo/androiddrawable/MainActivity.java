package com.simon.rameworkdemo.androiddrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
    }


    public void buttonClick(View view) {
        Toast.makeText(this, "图片宽度：" + imageView.getWidth(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "图片高度：" + imageView.getHeight(), Toast.LENGTH_SHORT).show();
    }





}
