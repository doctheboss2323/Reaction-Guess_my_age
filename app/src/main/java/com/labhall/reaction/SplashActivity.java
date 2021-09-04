package com.labhall.reaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView doge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doge=findViewById(R.id.doge);
        rotateImg();
        new CountDownTimer(3000, 1000   ) {
            public void onTick(long millisUntilFinished) {
            }
            public void onFinish() {
                Intent intent =new Intent(SplashActivity.this,gameActivity.class);
                startActivity(intent);
            }
        }.start();

    }
    public void rotateImg(){
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        findViewById(R.id.doge).startAnimation(rotateAnimation);
    }
}