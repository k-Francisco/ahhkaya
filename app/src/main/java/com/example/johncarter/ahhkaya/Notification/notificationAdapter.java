package com.example.johncarter.ahhkaya.Notification;

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

public class notificationAdapter extends ArrayAdapter<NotificationModel> {


    private Context mContext;
    private int         mResource;
    private List<NotificationModel> nNotifications;

    public notificationAdapter(Context context, int resource, List<NotificationModel> notifications) {
        super(context, resource, notifications);

        mContext = context;
        mResource = resource;
        nNotifications = notifications;
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

        NotificationModel notification = nNotifications.get(position);
        if (notification != null) {
            if (holder.heading != null) {
                holder.heading.setText(notification.getName() + " " + notification.getMessage());
            }
            if (holder.notifImg != null) {
                holder.notifImg.setImageResource(notification.getImageId());
            }
            if (holder.chat != null) {
                holder.chat.setImageResource(notification.getImageId2());
            }

        }

        return convertView;
    }

    private static class ViewHolder {
        TextView heading;
        ImageView notifImg;
        ImageView chat;

        public ViewHolder(View view) {
            heading = (TextView) view.findViewById(R.id.heading);
            notifImg = (ImageView) view.findViewById(R.id.notifImg);
            chat = (ImageView) view.findViewById(R.id.notifTypeImg);
        }
    }
}
