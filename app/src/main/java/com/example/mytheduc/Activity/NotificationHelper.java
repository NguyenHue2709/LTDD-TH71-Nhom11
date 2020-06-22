package com.example.mytheduc.Activity;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

import com.example.mytheduc.R;

public class NotificationHelper extends ContextWrapper {
    public static final String chanelID = "chanel1ID";
    public static final String chanelName = "Chanel 1";

    private  NotificationManager mManager;

    public NotificationHelper(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChanel();
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    public void createChanel() {
        NotificationChannel chanel1 = new NotificationChannel(chanelID, chanelName, NotificationManager.IMPORTANCE_DEFAULT);
        chanel1.enableLights(true);
        chanel1.enableVibration(true);
        chanel1.setLightColor(R.color.colorPrimary);
        chanel1.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getmManager().createNotificationChannel(chanel1);
    }

    public NotificationManager getmManager() {
        if (mManager == null) {
            mManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        return mManager;
    }

    public NotificationCompat.Builder getChanel1Noti () {
        return new NotificationCompat.Builder(getApplicationContext(), chanelID)
                /*.setContentTitle(title)
                .setContentText(mess)*/
                .setSmallIcon(R.drawable.ic_one);
    }
}
