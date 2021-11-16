package com.example.tabletworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {
    public static final String EXTRA_WORKOUT_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatils);

        DeatilsFragment deatilsFragment= (DeatilsFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_datils);
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        deatilsFragment.setWorkout(workoutId);

    }
}
