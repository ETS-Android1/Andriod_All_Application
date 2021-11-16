package com.example.beeradvisor;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Spinner;
        import android.widget.Switch;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void onClickFindView (View v){

            Spinner spcolor = findViewById(R.id.color);
            String s = String.valueOf(spcolor.getSelectedItem());
            TextView msg = findViewById(R.id.btn_msg);
            String suggestion = BeerExpert.getSuggestion(s);
//        switch (s){
//            case " light":
//                msg.setText("Qindao"+"\n "+"SnowFlack");
//            case "Amber":
//                msg.setText("Ha pi "+"\n "+"Blue Arrow ");
//            case "Brown":
//                msg.setText("jack amber"+"\n "+"Red moose");
//            case "Black":
//                msg.setText("Jiali paol"+"\n "+"Gout speed");
//        }
            msg.setText(suggestion);


        }
    }
