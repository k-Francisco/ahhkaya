package com.example.johncarter.ahhkaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by john carter on 11/19/2016.
 */

public class splash extends Activity {
    ImageView e, right,left,slogan;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        e = (ImageView) findViewById(R.id.e);
        right = (ImageView) findViewById(R.id.dotright);
        left = (ImageView) findViewById(R.id.dotleft);
        slogan = (ImageView) findViewById(R.id.slogan);

        startanimation();

    }

    private void startanimation() {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        e.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                slogan.startAnimation(animation);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.pop);
                left.startAnimation(animation);
                left.setScaleX(1);
                left.setScaleY(1);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.pop);
                        right.startAnimation(animation);
                        right.setScaleX(1);
                        right.setScaleY(1);

                        animation.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {


                                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                                left.startAnimation(animation);
                                right.startAnimation(animation);
                                e.startAnimation(animation);
                                slogan.startAnimation(animation);

                                left.setVisibility(View.GONE);
                                right.setVisibility(View.GONE);
                                e.setVisibility(View.GONE);
                                slogan.setVisibility(View.GONE);

                                Thread splashThread = new Thread(){

                                    @Override
                                    public void run() {
                                        try {
                                            int waited = 0;
                                            while(waited < 1700){
                                                sleep(100);
                                                waited+=100;
                                            }
                                            Intent intent = new Intent(splash.this, loginsignup.class);
                                            startActivity(intent);
                                            splash.this.finish();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }finally {
                                            splash.this.finish();
                                        }
                                    }
                                };
                                splashThread.start();
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }
                        });
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
