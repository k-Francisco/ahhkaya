package com.example.johncarter.ahhkaya.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import com.example.johncarter.ahhkaya.R;



public class activitydetailsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_activity_details, container, false);
        View rootview = inflater.inflate(R.layout.fragment_activity_details, container, false);
        RatingBar ratingBar = (RatingBar) rootview.findViewById(R.id.ratingBar);
        ratingBar.setNumStars(5);
        ratingBar.setRating(Float.parseFloat("4.5"));
        return rootview;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }
}
