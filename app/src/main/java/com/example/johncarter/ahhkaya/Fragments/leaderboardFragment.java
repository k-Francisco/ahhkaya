package com.example.johncarter.ahhkaya.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.johncarter.ahhkaya.LeaderBoard.LeaderBoardAdapter;
import com.example.johncarter.ahhkaya.LeaderBoard.LeaderboardController;
import com.example.johncarter.ahhkaya.R;

/**
 * Created by john carter on 11/24/2016.
 */

public class leaderboardFragment extends Fragment {

    FrameLayout fl;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_leader_board,container,false);
        fl = (FrameLayout) rootView.findViewById(R.id.menu_frame);
        ListView listView = (ListView) rootView.findViewById(R.id.listViewLeaderboard);
        LeaderboardController controller = new LeaderboardController();
        LeaderBoardAdapter adapter = new LeaderBoardAdapter(rootView.getContext(), R.layout.leaderboard_list_layout,
                controller.getLeaderBoardModel());
        listView.setAdapter(adapter);
        return rootView;
}
}
