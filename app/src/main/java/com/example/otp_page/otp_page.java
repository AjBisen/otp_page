package com.example.otp_page;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class otp_page extends Activity {
    private Button bt,bt2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_otp_page);
        bt2 =  findViewById(R.id.reswlc);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });

    }

        private void openActivity() {
            Intent intent = new Intent(    this,MainActivity.class);
            startActivity(intent);

        }
    }




