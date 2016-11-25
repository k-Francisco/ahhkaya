package com.example.johncarter.ahhkaya.LeaderBoard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.johncarter.ahhkaya.R;

import java.util.List;

/**
 * Created by john carter on 11/24/2016.
 */

public class LeaderBoardAdapter extends ArrayAdapter<LeaderBoardModel> {

    private Context mContext;
    private int mResource;
    private List<LeaderBoardModel> mVolunteers;
    public LeaderBoardAdapter(Context context, int resource, List<LeaderBoardModel> volunteers) {
        super(context, resource, volunteers);

        mContext = context;
        mResource = resource;
        mVolunteers = volunteers;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(mResource, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        LeaderBoardModel leaderBoardModel = mVolunteers.get(position);
        if (leaderBoardModel != null) {
            if (holder.volunteerName != null) {
                holder.volunteerName.setText(leaderBoardModel.getName());
            }
            if (holder.volunteerPoints != null) {
                holder.volunteerPoints.setText(leaderBoardModel.getPoints());
            }
            if (holder.volunteerImg != null) {
                holder.volunteerImg.setImageResource(leaderBoardModel.getVolunteerImage());
            }
            if (holder.volunteerBadges != null) {
                holder.volunteerBadges.setImageResource(leaderBoardModel.getBadgeImage());
            }
            if (holder.volunteerRank != null) {
                holder.volunteerRank.setImageResource(leaderBoardModel.getRankingImage());
            }
        }

        return convertView;
    }

    private static class ViewHolder{
        TextView volunteerName;
        TextView volunteerPoints;
        ImageView volunteerImg;
        ImageView volunteerBadges;
        ImageView volunteerRank;

        public ViewHolder(View view){
            volunteerName = (TextView)view.findViewById(R.id.nameTxt);
            volunteerPoints = (TextView)view.findViewById(R.id.pointsTxt);
            volunteerImg = (ImageView)view.findViewById(R.id.volunteerImage);
            volunteerRank = (ImageView)view.findViewById(R.id.volunteerRank);
        }

    }
}
