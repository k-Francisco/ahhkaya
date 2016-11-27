package com.example.johncarter.ahhkaya;

import android.app.Activity;
import android.support.v4.app.FragmentManager;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.IdRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;

import com.example.johncarter.ahhkaya.Fragments.AllFragment;
import com.example.johncarter.ahhkaya.Fragments.HomeFragment;
import com.example.johncarter.ahhkaya.Fragments.PopularFragment;
import com.example.johncarter.ahhkaya.Fragments.Profile;
import com.example.johncarter.ahhkaya.Fragments.RecommendedFragment;
import com.example.johncarter.ahhkaya.Fragments.leaderboardFragment;
import com.example.johncarter.ahhkaya.Fragments.notificationFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;
    BottomBarTab notifBadge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.BLUE);
//        }


        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.menu_frame, new HomeFragment()).commit();


        TabLayout tab = (TabLayout)findViewById(R.id.topActionBar);
        tab.addTab(tab.newTab().setText("Recommended"));
        tab.addTab(tab.newTab().setText("Popular"));
        tab.addTab(tab.newTab().setText("All"));

        ViewPager viewpager = (ViewPager)findViewById(R.id.page);
        //setupViewPager(viewpager);
        tab.setupWithViewPager(viewpager);

        viewpager.setOnPageChangeListener(

                new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                        FragmentManager fm = getSupportFragmentManager();
                        if(position == 0){
                            fm.beginTransaction().replace(R.id.menu_frame,new RecommendedFragment()).commit();
                        }
                        else if(position == 1){
                            fm.beginTransaction().replace(R.id.menu_frame, new PopularFragment()).commit();
                        }
                        else if(position == 2){
                            fm.beginTransaction().replace(R.id.menu_frame, new AllFragment()).commit();
                        }
                    }

                    @Override
                    public void onPageSelected(int position) {
                        FragmentManager fm = getSupportFragmentManager();
                        if(position == 0){
                            fm.beginTransaction().replace(R.id.menu_frame,new RecommendedFragment()).commit();
                        }
                        else if(position == 1){
                            fm.beginTransaction().replace(R.id.menu_frame, new PopularFragment()).commit();
                        }
                        else if(position == 2){
                            fm.beginTransaction().replace(R.id.menu_frame, new AllFragment()).commit();
                        }
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                }

        );

       tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           FragmentManager fm = getSupportFragmentManager();
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    fm.beginTransaction().replace(R.id.menu_frame,new RecommendedFragment()).commit();
                }
                else if(tab.getPosition() == 1){
                    fm.beginTransaction().replace(R.id.menu_frame, new PopularFragment()).commit();
                }
                else if(tab.getPosition() == 2){
                    fm.beginTransaction().replace(R.id.menu_frame, new AllFragment()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    fm.beginTransaction().replace(R.id.menu_frame,new RecommendedFragment()).commit();
                }
                else if(tab.getPosition() == 1){
                    fm.beginTransaction().replace(R.id.menu_frame, new PopularFragment()).commit();
                }
                else if(tab.getPosition() == 2){
                    fm.beginTransaction().replace(R.id.menu_frame, new AllFragment()).commit();
                }
            }
        });

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottom_Bar);
        notifBadge = bottomBar.getTabWithId(R.id.tab_notification);
        notifBadge.setBadgeCount(10);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId){
                FragmentManager fm = getSupportFragmentManager();

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
                FragmentManager fm = getSupportFragmentManager();

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

    }
    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(android.support.v4.app.FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }
    private void setupViewPager(ViewPager viewpager){
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new RecommendedFragment(), "Recommended");
        adapter.addFragment(new PopularFragment(), "Popular");
        adapter.addFragment(new AllFragment(),"All");
        viewpager.setAdapter(adapter);
    }




}
