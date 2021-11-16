package com.example.forresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSend(View v){


        EditText  ed1 = findViewById(R.id.et1);
        String s = ed1.getText().toString();
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("name",s);
        startActivityForResult(intent, 1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent intent){
        super.onActivityResult(requestCode,resultCode,intent);
        if(resultCode==2){
            if(requestCode==1){
                String s = intent.getStringExtra("home");
                TextView tv2 =findViewById(R.id.tv2);
                tv2.setText("Hi,Your HomeTOWN is:"+s);
            }

        }
    }
}
