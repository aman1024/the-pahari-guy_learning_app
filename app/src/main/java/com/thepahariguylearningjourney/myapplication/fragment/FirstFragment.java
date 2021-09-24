package com.thepahariguylearningjourney.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thepahariguylearningjourney.myapplication.R;

public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        //  attach with it's layout -- fragment ko -- inflate karate hai,, & Activity ko setContext ; to

        // Main logical part here,,,  in bw View view & return
            // . if wanted something



        return view;

    }
}
































