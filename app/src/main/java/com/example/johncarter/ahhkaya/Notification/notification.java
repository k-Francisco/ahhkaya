package com.example.johncarter.ahhkaya.Notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.johncarter.ahhkaya.R;

public class notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();

        ListView listView = (ListView) findViewById(R.id.listView);
        NotificationController controller = new NotificationController();
        notificationAdapter adapter = new notificationAdapter(this, R.layout.fragment_notification,
                controller.getNotifications());
        listView.setAdapter(adapter);

    }
}
