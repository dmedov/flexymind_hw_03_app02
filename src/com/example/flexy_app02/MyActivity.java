package com.example.flexy_app02;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MyActivity extends Activity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        RelativeLayout layout = (RelativeLayout)findViewById(R.id.layout);
        button = new Button(this);
        button.setText("lol");

        layout.addView(button);
        button.setWidth(100);
        button.setHeight(100);
        button.setX(100);
        button.setY(100);
    }

}
