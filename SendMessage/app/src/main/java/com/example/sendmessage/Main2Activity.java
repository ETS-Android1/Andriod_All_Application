package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String s= intent.getStringExtra("name");
       String  height = intent.getStringExtra("Height");
       //String s1= "Name:"+ s+" \n Height:"+ height;
        TextView tv = findViewById(R.id.tv);
        tv.setText("Name:"+ s+" \n Height:"+ height);
    }
}
