package com.example.johncarter.ahhkaya.Notification;

import com.example.johncarter.ahhkaya.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john carter on 11/24/2016.
 */

public class NotificationController {
    private List<NotificationModel> nNotifications;

    public NotificationController(){
        nNotifications = new ArrayList<>();
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message", R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));
        nNotifications.add(new NotificationModel("Charles Cruz","has sent you a message",R.drawable.notification_movie02, R.drawable.notification_chat));

    }

    public List<NotificationModel> getNotifications() {
        return nNotifications;
    }
}
