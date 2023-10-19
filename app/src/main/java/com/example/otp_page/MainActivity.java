package com.example.otp_page;

import static android.view.View.*;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class MainActivity extends Activity {


    ImageView imageView;
    private Button bt, bt2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image);

          bt =  findViewById(R.id.loginBTN);
          bt2 =  findViewById(R.id.reswlc);

        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Image Click", Toast.LENGTH_SHORT).show();
            }
        });
        bt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Submit Click", Toast.LENGTH_SHORT).show();
            }
        });
        bt2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });

    }
    private void openActivity() {
       // if( )
     //   Intent intent = new Intent(    this, MainActivity3.class);
       // startActivity(intent);

    }
}
