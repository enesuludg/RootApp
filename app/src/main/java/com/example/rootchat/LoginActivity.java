package com.example.rootchat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {


    public  void init(){


        Toolbar actionbarlogin = findViewById(R.id.actionbarlogin);
        setSupportActionBar(actionbarlogin);
        getSupportActionBar().setTitle("Sing In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

    }
}
