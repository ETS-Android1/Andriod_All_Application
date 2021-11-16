package com.example.tossheadortails;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    TextView tv_result;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        textView = findViewById(R.id.tv);
        imageView = findViewById(R.id.head_imv);
        tv_result=findViewById(R.id.tv_result);
        imageView.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        RotateAnimation rotateAnimation= new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,
                .5f,RotateAnimation.RELATIVE_TO_SELF,.5f);
        rotateAnimation.setDuration(1000);
        imageView.startAnimation(rotateAnimation);
        Toast.makeText(getApplicationContext(),"Head",Toast.LENGTH_LONG);
        Random random=  new Random();
        int rand= random.nextInt(2)+1;
        if(rand==1){
            tv_result.setText("Head");

        }else{
            tv_result.setText("Tail");
           // Toast.makeText(getApplicationContext(),"Tail",Toast.LENGTH_LONG);
        }

    }
}