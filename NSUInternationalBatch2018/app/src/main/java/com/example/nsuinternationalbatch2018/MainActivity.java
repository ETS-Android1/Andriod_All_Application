package com.example.nsuinternationalbatch2018;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_name, et_pass;
    Button btn;
    TextView vaild_invaild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        et_name = findViewById(R.id.et_name);
//        et_pass = findViewById(R.id.ed_pass);
//        btn = findViewById(R.id.longin_btn);
//        vaild_invaild = findViewById(R.id.tv_vaild);

    }
}