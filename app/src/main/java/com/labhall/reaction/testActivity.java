package com.labhall.reaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class testActivity extends AppCompatActivity {

    ImageView btc,eth,ada,bnb,trx;
    ImageView doge;
    Button click;

    long time=0;

    int btctop=-80, btcleft=200;
    int adatop=-680, adaleft=30;
    int ethtop=-1980, ethleft=350;
    int trxtop=-2700, trxleft=100;
    int bnbtop=-3400, bnbleft=400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        btc=findViewById(R.id.btc);
        eth=findViewById(R.id.eth);
        ada=findViewById(R.id.ada);
        bnb=findViewById(R.id.bnb);
        trx=findViewById(R.id.trx);

        doge=findViewById(R.id.doge);
        doge.setVisibility(View.INVISIBLE);

        click=findViewById(R.id.click);

        new CountDownTimer(4000, 5) {
            public void onTick(long millisUntilFinished) {
                btctop=setMargins(btcleft,btctop,btc);
                ethtop=setMargins(ethleft,ethtop,eth);
                adatop=setMargins(adaleft,adatop,ada);
                bnbtop=setMargins(bnbleft,bnbtop,bnb);
                trxtop=setMargins(trxleft,trxtop,trx);
            }
            public void onFinish() {
                bnb.setVisibility(View.INVISIBLE);
                eth.setVisibility(View.INVISIBLE);
                trx.setVisibility(View.INVISIBLE);
                doge.setVisibility(View.VISIBLE);

                new CountDownTimer(3000, 1   ) {
                    public void onTick(long millisUntilFinished2) {
                        click.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                time=(3000-millisUntilFinished2);
                            }
                        });
                    }
                    public void onFinish() {
                        Intent intent = new Intent(testActivity.this,resultActivity.class);
                        intent.putExtra("time", time);
                        startActivity(intent);

                    }
                }.start();
            }
        }.start();
    }
    public int setMargins(int left,int top,ImageView img)
    {
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(left, top,0,0);
        top=top+15;
        img.setLayoutParams(lp);
        return top;
    }
}