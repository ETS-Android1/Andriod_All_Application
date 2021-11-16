package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button btn = null;
    TextView tv1 = null;
    TextView tv2 = null;
    EditText et1 = null;
    int rand = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand = (int) (Math.random() * 98 + 1);
        et1 = findViewById(R.id.et1);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv2.setText(R.string.prompt);
        btn = findViewById(R.id.btn);
    }
    

            public void onClick(View v) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);

                if (num - rand > 0) {
                    tv2.setText(R.string.big);
                } else if (num - rand < 0) {
                    tv2.setText(R.string.small);
                } else {
                    tv2.setText(R.string.result);
                    tv1.setText("" + rand);

                }
            }

        }



