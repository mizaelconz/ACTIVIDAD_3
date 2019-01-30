package com.example.misaelislas.actividad_3;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity   {
////////////////////////////////////////////////////////////////////// PARTE 1
    {
        final TextView textView = (TextView) findViewById(R.id.tv1);
        Button button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Holaaaa");
            }
        });
    }


    ////////////////////////////////////////////////////////// PARTE 2
    @Override
    protected void onStart() {
        super.onStart();
        RelativeLayout myLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                handleTouch(motionEvent);
                return false;
            }
        });
    }

    protected void handleTouch(MotionEvent m) {
        final TextView textView = (TextView) findViewById(R.id.tv1);
        textView.setText("" + m.getX() + "," + m.getY());


        int numberOfPointers = m.getPointerCount();
        for (int i = 0; i < numberOfPointers; i++) ;
    }


}





