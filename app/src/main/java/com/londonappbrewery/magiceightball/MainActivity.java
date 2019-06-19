package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ask = findViewById(R.id.ask_button);
        final ImageView ball = findViewById(R.id.ballView);
        final int[] balls = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ran = new Random(System.currentTimeMillis());
                int m = ran.nextInt(5);
                for(int i = 0;i<5;i++){
                    ball.setImageResource(balls[i]);
                }
                ball.setImageResource(balls[m]);
            }
        });
    }
}
