package com.example.rootchat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private Toolbar actionbar;
    private ViewPager vpmain;
    private TabLayout tabsmain;
    private TabsAdapter tabsadapter;

    public void init(){

        actionbar = (Toolbar) findViewById(R.id.actionappbar);
        setSupportActionBar(actionbar);
        getSupportActionBar().setTitle(R.string.app_name);

        vpmain =(ViewPager) findViewById(R.id.vpmain);

        tabsadapter =new TabsAdapter(getSupportFragmentManager());

        vpmain.setAdapter(tabsadapter);




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
