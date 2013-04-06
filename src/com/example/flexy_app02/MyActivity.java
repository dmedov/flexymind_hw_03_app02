package com.example.flexy_app02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;

public class MyActivity extends Activity {
    Button button;
    RelativeLayout layout;
    Random rndInt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        layout = (RelativeLayout)findViewById(R.id.layout);
        button = new Button(this);
        rndInt = new Random();

        // init param
        button.setText("lol");
        button.setWidth(100);
        button.setHeight(100);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveBtn();
            }
        });

        // add btn to layout
        layout.addView(button);
    }

    private void moveBtn() {
        int newX = getRandomX();
        int newY = getRandomY();
        button.setX(newX);
        button.setY(newY);
    }

    private int getRandomX() {
        int max = layout.getWidth();
        return rndInt.nextInt(max - button.getWidth());
    }

    private int getRandomY() {
        int max = layout.getHeight();
        return rndInt.nextInt(max - button.getHeight());
    }
}
