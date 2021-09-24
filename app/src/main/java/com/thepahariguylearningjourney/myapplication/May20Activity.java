package com.thepahariguylearningjourney.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class May20Activity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_may20);

        layout = findViewById(R.id.layout1);

        AnimationDrawable animationDrawable = (AnimationDrawable) layout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

    }

    @SuppressLint("SetTextI18n")
    public void message(View view) {
        Toast.makeText(this, "May Progress : ", Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.textView);


        textView.setText("hello, \n  till now have finished nearly 60% of Android javaHead,, continuining to learn and code>>");

    }
    }

