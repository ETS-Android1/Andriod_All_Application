package com.example.tabletworkout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StopWatchFragment extends Fragment implements View.OnClickListener{
    private int seconds =0;
    private boolean running = true;

    public StopWatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout =inflater.inflate(R.layout.fragment_stop_watch, container, false);
        Button btnStart= layout.findViewById(R.id.start);
        btnStart.setOnClickListener(this);
        Button btnStop= layout.findViewById(R.id.stop);
        btnStop.setOnClickListener(this);
        Button btnRestart=layout.findViewById(R.id.restart);
        btnRestart.setOnClickListener(this);
        if(savedInstanceState!= null){
            seconds= savedInstanceState.getInt("sec");
            running=savedInstanceState.getBoolean("state");
        }
        runTimer(layout);
        // Inflate the layout for this fragment
        return layout;
    }
    private void onClickStart(View v){
        running = true;
    }


    private void onClickStop(View v){
        running = false;
    }

    private void onClickReset(View v){
        running = true;
        seconds = 0;

    }
    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

        outState.putInt("Second",seconds);
        outState.putBoolean("sate",running);
    }
    private void runTimer(View view){
        final Handler handler = new Handler();
        final TextView tv= view.findViewById(R.id.tv_time);
        handler.post(new Runnable() {
            @Override
            public void run() {
                // to display the  time every seconed
                int h = seconds/3600;
                int m = (seconds%3600)/60;
                int s = seconds%60;
                String time = String.format("%02d:%02d:%02d",h,m,s);
                tv.setText(time);
                if(running)
                    seconds ++;
                handler.postDelayed(this,1000);

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.start:
                onClickStart(v);
                break;
            case  R.id.stop:
                onClickStop(v);
                break;
            case  R.id.restart:
                onClickReset(v);
                break;

        }


    }
}
