package com.example.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_1;
    Button btn_2;
    Button btn_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);
        btn_2 = findViewById(R.id.bn_2);
        btn_2.setOnClickListener(this);
        btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
               case R.id.btn_1:
                     Toast.makeText(getApplicationContext(),
                             "This is button1", Toast.LENGTH_LONG).show();
                                       break;
                 case R.id.bn_2:
                     Toast.makeText(getApplicationContext(),
                             "This is button2", Toast.LENGTH_LONG).show();
                                   break;
                 case R.id.btn_3:
                     Toast.makeText(getApplicationContext(),
                             "This is button3", Toast.LENGTH_LONG).show();
                                       break;
             }
    }

//        btn_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                        Toast.makeText(getApplicationContext(),
//                                "This is button1", Toast.LENGTH_LONG).show();
//
//            }
//        });
//      btn_2.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Toast.makeText(getApplicationContext(),
//                      "This is button2", Toast.LENGTH_LONG).show();
//          }
//      });
//
//      btn_3.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Toast.makeText(getApplicationContext(),
//                      "This is button3", Toast.LENGTH_LONG).show();
//          }
//      });
//        btn_1.setOnClickListener(onClickListener);
//        btn_2.setOnClickListener(onClickListener);
//        btn_3.setOnClickListener(onClickListener);
//    }
//      private  View.OnClickListener onClickListener= new View.OnClickListener() {
//         @Override
//         public void onClick(View v) {
//             switch (v.getId()) {
//                 case R.id.btn_1:
//                     Toast.makeText(getApplicationContext(),
//                             "This is button1", Toast.LENGTH_LONG).show();
  //                           break;
//                 case R.id.bn_2:
//                     Toast.makeText(getApplicationContext(),
//                             "This is button2", Toast.LENGTH_LONG).show();
 //                       break;
//                 case R.id.btn_3:
//                     Toast.makeText(getApplicationContext(),
//                             "This is button3", Toast.LENGTH_LONG).show();
  //                           break;
//             }
//         }
//  };
    }

