package com.labhall.reaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class testActivity extends AppCompatActivity {

    ImageView btc,eth,ada,bnb,usdt;
    int btctop=-80, btcleft=70;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        btc=findViewById(R.id.btc);


//        new CountDownTimer(10000, 10) {
//            public void onTick(long millisUntilFinished) {
//                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//                lp.setMargins(btcleft, btctop+1,0,0);
//                btctop++;
//                btc.setLayoutParams(lp);
//            }
//            public void onFinish() { //not supposed to finish
//            }
//        }.start();
    }
}