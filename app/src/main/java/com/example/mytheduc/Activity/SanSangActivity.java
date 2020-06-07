package com.example.mytheduc.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Layout;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.mytheduc.R;

public class SanSangActivity extends AppCompatActivity {
    private TextView timeText;
    private ProgressBar progressBar;
    private TextView tv_tenBaiTap;
    private GestureDetector gestureDetector;
    private ImageButton ibtn_pre;
    private ImageButton ibtn_pause;
    private ImageButton ibtn_next;

    private boolean isPaused = false;
    private boolean isCanceled = false;
    private long timeRemaining = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sansang);
        timeText = (TextView) findViewById(R.id.txtSecond);
        progressBar = findViewById(R.id.progress_circular);
        tv_tenBaiTap = findViewById(R.id.txt_ten);
        gestureDetector = new GestureDetector(this, new MyGesture());
        ConstraintLayout mylayout = findViewById(R.id.layout_sansang);
        mylayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                PauseTimer();
                return false;
            }
        });
        StartTimer(10000, 1000);
    }
    class MyGesture extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onDown(MotionEvent e) {
            /*Intent intent = new Intent(SanSangActivity.this, BatDau_Pause.class);
            startActivity(intent);*/
            final Dialog dialog = new Dialog(SanSangActivity.this);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.fragment_pause);
            ImageView img_pause = (ImageView) dialog.findViewById(R.id.ibtn_pause);
            img_pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ResumeTimer();
                    dialog.cancel();
                }
            });
            dialog.show();

            return super.onDown(e);
        }
    }
    public void StartTimer (long millisInFuture,long countDownInterval) {
        CountDownTimer timer;
        //Initialize a new CountDownTimer instance
        timer = new CountDownTimer(millisInFuture, countDownInterval) {
            public void onTick(long millisUntilFinished) {
                //do something in every tick
                if (isPaused || isCanceled) {
                    //If the user request to cancel or paused the
                    //CountDownTimer we will cancel the current instance
                    cancel();
                } else {
                    //Display the remaining seconds to app interface
                    //1 second = 1000 milliseconds
                    timeText.setText("" + millisUntilFinished / 1000);
                    //Put count down timer remaining time in a variable
                    timeRemaining = millisUntilFinished;
                    int curent = progressBar.getProgress();
                    if (curent < progressBar.getMax()){
                        progressBar.setProgress(curent + 10);
                    }
                }
            }

            public void onFinish() {
                //Do something when count down finished
                progressBar.setProgress(0);
                timeText.setText("Done");
                StartTimer(15000, 1000);

            }
        }.start();
    }
    public void PauseTimer (){
        isPaused = true;
    }
    public void ResumeTimer (){
        isPaused = false;
        isCanceled = false;

        long millisInFuture = timeRemaining;
        long countDownInterval = 1000;
        new CountDownTimer(millisInFuture, countDownInterval){
            public void onTick(long millisUntilFinished){
                //Do something in every tick
                if(isPaused || isCanceled)
                {
                    //If user requested to pause or cancel the count down timer
                    cancel();
                }
                else {
                    int curent = progressBar.getProgress();
                    if (curent < progressBar.getMax()){
                        progressBar.setProgress(curent + 10);
                    }
                    timeText.setText("" + millisUntilFinished / 1000);
                    //Put count down timer remaining time in a variable
                    timeRemaining = millisUntilFinished;
                }
            }
            public void onFinish(){
                //Do something when count down finished
                timeText.setText("Done");
            }
        }.start();
    }
    public void CancelTimer (){
        isCanceled = true;
    }
}
