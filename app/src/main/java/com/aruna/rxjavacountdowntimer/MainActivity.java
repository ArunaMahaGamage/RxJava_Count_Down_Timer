package com.aruna.rxjavacountdowntimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    TextView tv_timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_timer = findViewById(R.id.tv_timer);

        new CountDownTimer(50L, TimeUnit.SECONDS) {

            @Override
            public void onTick(long tickValue) {
                Log.d("CountDown", "Remaining: " + tickValue);
                tv_timer.setText("" + tickValue);
            }

            @Override
            public void onFinish() {
                Log.d("CountDown", "The End!! ");
            }
        }.start();
    }
}
