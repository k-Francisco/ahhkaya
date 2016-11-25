package com.example.johncarter.ahhkaya;

import android.app.Activity;
import android.app.FragmentManager;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.johncarter.ahhkaya.Fragments.HomeFragment;
import com.example.johncarter.ahhkaya.Fragments.Profile;
import com.example.johncarter.ahhkaya.Fragments.leaderboardFragment;
import com.example.johncarter.ahhkaya.Fragments.notificationFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends Activity {

    BottomBarTab notifBadge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.BLUE);
//        }


        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.menu_frame, new HomeFragment()).commit();

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottom_Bar);
        notifBadge = bottomBar.getTabWithId(R.id.tab_notification);
        notifBadge.setBadgeCount(10);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {

                FragmentManager fm = getFragmentManager();

                if (tabId == R.id.tab_home){
                    fm.beginTransaction().replace(R.id.menu_frame,new HomeFragment()).commit();
                }

                if(tabId == R.id.tab_notification){
                    //startActivity(new Intent(FiveColorChangingTabsActivity.this,NotificationActivity.class));
                    fm.beginTransaction().replace(R.id.menu_frame,new notificationFragment()).commit();
                    notifBadge.removeBadge();
                }
                if(tabId == R.id.tab_leaderboard){
                    fm.beginTransaction().replace(R.id.menu_frame, new leaderboardFragment()).commit();
                }
                if (tabId == R.id.tab_profile){
                    fm.beginTransaction().replace(R.id.menu_frame, new Profile()).commit();
                }

            }
        });

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                //Toast.makeText(getApplicationContext(), TabMessage.get(tabId, true), Toast.LENGTH_LONG).show();
            }
        });

    }
}
