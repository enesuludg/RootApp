package com.example.rootchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button btnlogin,btnregister;

    public void init(){

        btnlogin = (Button) findViewById(R.id.btn2);
        btnregister =(Button) findViewById(R.id.btn1);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(YourCurrentActivity.this, YourNewActivity.class));
             startActivity(new Intent(WelcomeActivity.this,LoginActivity.class));
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentregister = new Intent(WelcomeActivity.this,RegisterActivity.class);
                startActivity(intentregister);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
