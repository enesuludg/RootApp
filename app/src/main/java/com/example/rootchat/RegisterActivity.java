package com.example.rootchat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    public void init(){

        Toolbar toolbarregister = findViewById(R.id.actionbarregister);
        setSupportActionBar(toolbarregister);
        getSupportActionBar().setTitle("Sing Up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }
}
