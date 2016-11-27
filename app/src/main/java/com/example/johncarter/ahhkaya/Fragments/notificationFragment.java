package com.example.johncarter.ahhkaya.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.johncarter.ahhkaya.Notification.NotificationController;
import com.example.johncarter.ahhkaya.R;
import com.example.johncarter.ahhkaya.Notification.notificationAdapter;


public class notificationFragment extends Fragment {
    FrameLayout fl;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_notification,container,false);
        fl = (FrameLayout) rootView.findViewById(R.id.menu_frame);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setNestedScrollingEnabled(false);
        NotificationController controller = new NotificationController();
        notificationAdapter adapter = new notificationAdapter(rootView.getContext(), R.layout.fragment_notification,
                controller.getNotifications());
        listView.setAdapter(adapter);
        return rootView;
    }
}
