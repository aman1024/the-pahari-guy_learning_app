package com.thepahariguylearningjourney.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class August20Activity extends AppCompatActivity {

    TextView textView ;
    TextView txtSend ;
    String name;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_august20);
        textView = findViewById(R.id.textView);
        txtSend = findViewById(R.id.textString);

        button = findViewById(R.id.btnShare);


        Intent intent = getIntent();
      name =   intent.getStringExtra("message");

        textView.setText(name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String send = txtSend.getText().toString();

                Intent intent1 = new Intent();

                intent1.setAction(Intent.ACTION_SEND);
                intent1.setType("text/plain");
                intent1.putExtra(Intent.EXTRA_TEXT, send);

startActivity(intent1);
            }
        });


    }
}