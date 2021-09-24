package com.thepahariguylearningjourney.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.thepahariguylearningjourney.myapplication.fragment.FirstFragment;
import com.thepahariguylearningjourney.myapplication.fragment.SecondFragment;

public class Fragment_btn extends AppCompatActivity {

    Button btnGreen;
    Button btnYellow;
    LinearLayout linearLayout;      // this linear layout is ,, the bottom most linear layout in the component tree;
                                // via which -- fragment is connected

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        btnGreen = findViewById(R.id.btnGreen);
        btnYellow = findViewById(R.id.btnYellow);

        linearLayout = findViewById(R.id.linearLayout);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstFragment firstFragment = new FirstFragment();

/* fragment transaction is a set of changes
you want to apply relating to the fragment, all at the same time.
* */
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, firstFragment);  // replace the linear layout with <----> 1st fragment obj.

                transaction.commit();

            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SecondFragment secondFragemnt = new SecondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, secondFragemnt);
                transaction.commit();

            }
        });

































    }
}