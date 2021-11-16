package com.example.forresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String s = "Your Name is:"+intent.getStringExtra("name");

        TextView tv1= findViewById(R.id.tv1);
        tv1.setText(s);
    }

    public void onClickReturn(View v){

        EditText et2 = findViewById(R.id.et2);
        String home = et2.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("home",home);
        setResult(2,intent);
        finish();

    }


}
