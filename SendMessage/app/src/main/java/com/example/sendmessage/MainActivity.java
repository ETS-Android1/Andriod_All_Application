package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpen(View v){
        Intent intent = new Intent (this,Main2Activity.class);
        intent.putExtra("name","SUE Laoshi");
        intent.putExtra("Height","I Don't know ");
        startActivity(intent);
    }

}
