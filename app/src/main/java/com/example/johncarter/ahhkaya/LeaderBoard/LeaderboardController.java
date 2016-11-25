package com.example.johncarter.ahhkaya.LeaderBoard;

import com.example.johncarter.ahhkaya.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john carter on 11/24/2016.
 */

public class LeaderboardController {

    private List<LeaderBoardModel> leaderBoardModel;

    public LeaderboardController(){ leaderBoardModel = new ArrayList<>();}

    public List<LeaderBoardModel> getLeaderBoardModel(){

        leaderBoardModel = new ArrayList<>();
        leaderBoardModel.add(new LeaderBoardModel("Anton Ven Wycoco", "1000 points", R.drawable.numberone, R.drawable.anton));
        leaderBoardModel.add(new LeaderBoardModel("Rowan Atkinson", "800 points", R.drawable.numberone, R.drawable.anton));
        leaderBoardModel.add(new LeaderBoardModel("Charles Cruz", "729 points", R.drawable.numberone, R.drawable.anton));
        leaderBoardModel.add(new LeaderBoardModel("Kristian Francisco", "700 points", R.drawable.numberone, R.drawable.anton));
        leaderBoardModel.add(new LeaderBoardModel("Kobe Relativo", "600 points", R.drawable.numberone, R.drawable.anton));
        leaderBoardModel.add(new LeaderBoardModel("Mark Antonino", "500 points", R.drawable.numberone, R.drawable.anton));

        return leaderBoardModel;
    }
}
