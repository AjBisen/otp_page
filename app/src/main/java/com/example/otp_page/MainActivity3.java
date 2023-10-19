package com.example.otp_page;

import static android.view.View.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;



public class MainActivity3 extends ComponentActivity {

  private Button btn, btn2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        btn=findViewById(R.id.reswlc);
       // btn2=findViewById(R.id.button);


        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "Submit Click", Toast.LENGTH_SHORT).show();
                openActivity();
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }
    private void openActivity() {
        Intent intent = new Intent(MainActivity3.this, otp_page.class);
        startActivity(intent);

    }
}


