package com.thepahariguylearningjourney.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button_may;
    Button button_aug;
    EditText editText;
    Button button_quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_may = findViewById(R.id.btn_imgAnimation);
        button_aug = findViewById(R.id.btn_fragment_gr);


        editText = findViewById(R.id.editText);
//        button_quote = findViewById(R.id.btn_quote);           didn't use  ,, since onClick is applied


        button_may.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, May20Activity.class);
                startActivity(intent);

            }
        });

        button_aug.setOnClickListener(new View.OnClickListener() {       // the Activity which have Fragemnt,,, calling>>
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Fragment_btn.class);
                startActivity(intent);


//TODO: why it happened -- onClick didn't work well but -- btn.setOnclick (mehod) work well
            }
        });

    }

    public void august(View view) {
        String name = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this, August20Activity.class);

        intent.putExtra("message", name);
        startActivity(intent);

    }



    @Override
    public void onBackPressed() {       // Resolving the issue of,  (1back close app ) issue

//            super.onBackPressed();      // means -> direct exit


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to EXIT?")
                .setNegativeButton("NO", null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();   // this will kill all the activity process
                    }
                }).show();

    }
}