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
        //图片本身大小为 532x400 放置在xhdpi下，运行在xhdpi（240dpi ~ 320dpi）密度的设备上，显示的大小为532x400
        //图片本身大小为 532x400 放置在xhdpi下，运行在hdpi（160dpi ~ 240dpi）密度的设备上，图片被放大，显示的大小为709x533
        //图片本身大小为 532x400 放置在xhdpi下，运行在xxhdpi(320dpi ~ 480dpi)密度的设备上，图片被缩小，显示的大小为355x267
        Toast.makeText(this, "图片宽度：" + imageView.getWidth(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "图片高度：" + imageView.getHeight(), Toast.LENGTH_SHORT).show();
    }





}
