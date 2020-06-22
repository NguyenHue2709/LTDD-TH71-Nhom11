package com.example.mytheduc.Activity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.mytheduc.Model.BatDau_Model;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class SanSangActivity extends AppCompatActivity {
    private TextView timeText;
    private TextView txt1;
    private  TextView txt2;
    private ProgressBar progressBar;
    private TextView tv_tenBaiTap;
    private GestureDetector gestureDetector;
    private ImageView ibtn_pre;
    private ImageButton ibtn_pause;
    private ImageView ibtn_next;
    private int [] imgArray = new int[8];
    BatDauActivity batDauActivity = new BatDauActivity();
    private ImageView imageView;
    private Button btnTimer;
    private CountDownTimer countDownTimer;
    private CountDownTimer cdtDemNguoc;
    private  CountDownTimer cdtBaiTap;
    private CountDownTimer cdtNghiNgoi;
    private ArrayList<BatDau_Model> listBaiTap = new ArrayList<>();
    private static int position;

    private boolean isPaused = false;
    private boolean isCanceled = false;
    private long timeRemaining = 0;
    private boolean mRunning = true;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sansang);

        init();
        position = 0;
        int so = position + 1;
        String tenBT = so + "/8 " + listBaiTap.get(position).getTenBaiTap();
        tv_tenBaiTap.setText(tenBT);
        imageView.setImageResource(imgArray[position]);
        position++;
        countDownTimer = cdtDemNguoc;
        cdtDemNguoc = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
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
                    progressBar.setMax(5);
                    int curent = progressBar.getProgress();
                    if (curent < progressBar.getMax()) {
                        progressBar.setProgress(curent + 1);
                    }
                }
            }
            @Override
            public void onFinish() {
                txt1.setText("");
                txt2.setText("");
                progressBar.setProgress(0);
                countDownTimer = cdtBaiTap;
                cdtBaiTap = new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
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
                            progressBar.setMax(10);
                            int curent = progressBar.getProgress();
                            if (curent < progressBar.getMax()) {
                                progressBar.setProgress(curent + 1);
                            }
                        }
                    }

                    @Override
                    public void onFinish() {
                        autoClick();
                    }
                }.start();
            }
        }.start();
        btnTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer = cdtNghiNgoi;
                cdtNghiNgoi = new CountDownTimer(6000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
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
                            progressBar.setMax(6);
                            int curent = progressBar.getProgress();
                            if (curent < progressBar.getMax()) {
                                progressBar.setProgress(curent + 1);
                            }
                        }
                    }

                    @Override
                    public void onFinish() {
                        txt1.setText("");
                        txt2.setText("");
                        progressBar.setProgress(0);
                        countDownTimer = cdtBaiTap;
                        cdtBaiTap = new CountDownTimer(10000, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
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
                                    progressBar.setMax(10);
                                    int curent = progressBar.getProgress();
                                    if (curent < progressBar.getMax()) {
                                        progressBar.setProgress(curent + 1);
                                    }
                                }
                            }

                            @Override
                            public void onFinish() {
                                autoClick();
                            }
                        }.start();
                    }
                }.start();
            }
        });

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
        //StartTimer(10000, 1000);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Bài tập");
    }

    public void init (){
        timeText = (TextView) findViewById(R.id.txtSecond);
        progressBar = findViewById(R.id.progress_circular);
        tv_tenBaiTap = findViewById(R.id.txt_tenBaiTap);
        imgArray = batDauActivity.getImgArray();
        imageView = findViewById(R.id.img_baiTap);
        btnTimer = findViewById(R.id.btnTimer);
        listBaiTap = batDauActivity.getArrayList();
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);



    }
    class MyGesture extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onDown(MotionEvent e) {
            /*Intent intent = new Intent(SanSangActivity.this, BatDau_Pause.class);
            startActivity(intent);*/
            final Dialog dialog = new Dialog(SanSangActivity.this);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.fragment_pause);
            dialog.show();
            ImageView img_pause = (ImageView) dialog.findViewById(R.id.ibtn_pause);
            img_pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //countDownTimer.start();
                    dialog.cancel();
                }
            });
            ibtn_next = dialog.findViewById(R.id.ibtn_next);
            ibtn_pre = dialog.findViewById(R.id.ibtn_pre);
            if (position != 8) {
                ibtn_next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        isPaused = false;
                        autoClick();
                        dialog.cancel();
                        }
                });
            }
            else {
                ibtn_next.setClickable(false);
                Toast.makeText(SanSangActivity.this, "Đây là bài tập cuối cùng!", Toast.LENGTH_SHORT).show();
            }

            if (position != 1){
                ibtn_pre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        position -= 2;
                        isPaused = false;
                        autoClick();
                        dialog.cancel();
                    }
                });
            }
            else {
                ibtn_pre.setClickable(false);
                Toast.makeText(SanSangActivity.this, "Đây là bài tập đầu tiên!", Toast.LENGTH_SHORT).show();
            }


            return super.onDown(e);
        }
    }

    public void autoClick(){
        txt1.setText("Đã sẵn sàng tập!");
        txt2.setText("Tiếp theo");
        int so = position + 1;
        String tenBT = so + "/8 " + listBaiTap.get(position).getTenBaiTap();
        tv_tenBaiTap.setText(tenBT);
        imageView.setImageResource(imgArray[position]);
        position++;
        progressBar.setProgress(0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btnTimer.performClick();
            }
        }, 10);
    }
    public void PauseTimer (){
        isPaused = true;
    }
    public void ResumeTimer (){

    }
    public void CancelTimer (){
        isCanceled = true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
