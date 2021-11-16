package com.example.workout;

import android.app.ListFragment;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {

    public WorkoutListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] names = new String[Workout.workouts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Workout.workouts[i].getName();
        }
        ArrayAdapter<Workout> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1,Workout.workouts);
        setListAdapter(adapter);
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_workout_list, container, false);
        }
    }


