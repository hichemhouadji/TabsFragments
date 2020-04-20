package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayoutAdapter    adapter;
TabLayout tabLayout;
ViewPager viewPager;
int [] tableicons={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

tabLayout= (TabLayout) findViewById(R.id.mytablayout);
viewPager=findViewById(R.id.myviewpager);
        adapter=new TabLayoutAdapter(getSupportFragmentManager());
        adapter.addFragment(new first_fragment(),"tab 1");
        adapter.addFragment(new second_fragment(),"tab 2");
        adapter.addFragment(new third_fragment(),"tab 3");
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(tableicons[0]);
        tabLayout.getTabAt(1).setIcon(tableicons[1]);
        tabLayout.getTabAt(2).setIcon(tableicons[2]);
    }//end oncreate

}
