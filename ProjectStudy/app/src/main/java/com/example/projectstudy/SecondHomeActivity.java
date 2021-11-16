package com.example.projectstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_home);
        HomeFragment homeFragment= (HomeFragment)getSupportFragmentManager().
                findFragmentById(R.id.fragment);
    }
}
