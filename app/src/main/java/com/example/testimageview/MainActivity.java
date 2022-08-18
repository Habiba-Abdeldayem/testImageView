package com.example.testimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton b1blue, b2blue;
    ImageButton b1red;
    int firstImgId =0;
    int secondImgId =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1blue = (ImageButton) findViewById(R.id.blue_btn);
        b1blue.setTag("1");
        b1blue.setOnClickListener(this);
        b2blue = (ImageButton) findViewById(R.id.blue_btn2);
        b2blue.setTag("1");
        b2blue.setOnClickListener(this);
        b1red = (ImageButton) findViewById(R.id.red_button);
        b1red.setTag("2");
        b1red.setOnClickListener(this);

        String blueBtn_background = b1blue.getResources().toString();
        String redBtn_background = b1red.getResources().toString();





}

    @Override
    public void onClick(View view) {
        ImageButton tmpImgBtn = (ImageButton) view;
        if(tmpImgBtn.getTag() == "1") {
            tmpImgBtn.setTag("2");
            tmpImgBtn.setImageResource(R.drawable.red_btn);

        }
        else if(tmpImgBtn.getTag() == "2") {
            tmpImgBtn.setTag("1");
            tmpImgBtn.setImageResource(R.drawable.blue_btn);

        }
    }
}