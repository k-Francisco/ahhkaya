package com.example.johncarter.ahhkaya;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signup extends AppCompatActivity implements View.OnClickListener{

    private TextView mLogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        mLogIn = (TextView) findViewById(R.id.login);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.login:
                Intent intent = new Intent(signup.this, loginsignup.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
