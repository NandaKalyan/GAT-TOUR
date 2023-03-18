package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Splashact extends AppCompatActivity {

    ImageView one,two,three,four;

    private ProgressBar progressBar;
    private TextView percentageTextView;

    private int[] percentages = {1, 65, 77, 80, 93, 95,100};
    private int currentPercentageIndex = 0;

    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashact);


        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashact.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 12050);

        one = findViewById(R.id.imageView);
        Animation move = AnimationUtils.loadAnimation(this,R.anim.moving);
        one.setAnimation(move);

        two = findViewById(R.id.imageView2);
        Animation move2 = AnimationUtils.loadAnimation(this,R.anim.moving2);
        two.setAnimation(move2);

        three = findViewById(R.id.imageView9);
        Animation move3 = AnimationUtils.loadAnimation(this,R.anim.moving3);
        three.setAnimation(move3);

        four = findViewById(R.id.imageView10);
        Animation move4 = AnimationUtils.loadAnimation(this,R.anim.moving4);
        four.setAnimation(move4);



        progressBar = findViewById(R.id.progressBar);
        percentageTextView = findViewById(R.id.percentageTextView);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < percentages.length; i++) {
                        int percentage = percentages[i];
                        int progress = progressBar.getProgress();
                        int targetProgress = percentage * progressBar.getMax() / 100;
                        int increment = targetProgress > progress ? 1 : -1;
                        while (progress != targetProgress) {
                            progress += increment;
                            updateProgressBar(progress);
                            Thread.sleep(80); // duration of 7 seconds divided by 100 progress steps
                        }
                        currentPercentageIndex = i;

                        if (currentPercentageIndex < percentages.length - 1) {
                            Thread.sleep(650); // pause for 0.4 seconds before resuming
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

    }

    private void updateProgressBar(final int progress) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                progressBar.setProgress(progress);
                percentageTextView.setText(String.format("%d%%", progress * 100 / progressBar.getMax()));
                if (progress == percentages[currentPercentageIndex]) {
                    // add any code you want to execute at this percentage
                }
            }
        });
    }
}