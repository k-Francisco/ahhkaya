package com.example.johncarter.ahhkaya;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class loginsignup extends AppCompatActivity implements View.OnClickListener{

    private TextView mSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsignup);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        mSignUp = (TextView) findViewById(R.id.signup);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.signup:
                Intent intent = new Intent(loginsignup.this, signup.class);
                startActivity(intent);
                finish();
                break;
            case R.id.button:
                Intent intent1 = new Intent(loginsignup.this, MainActivity.class);

                startActivity(intent1);
                finish();
                break;


        }
    }
}
