package com.alvaro.intents.activity.intents.broadcast.receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
//Crear una muestre la hora en hh:mm y la cambie cada vez que reciba la emisión de ACTION_TIME_TICK
public class MainActivity extends AppCompatActivity {
    BroadcastReceiver tickReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hourTextView = (TextView) findViewById(R.id.hour);
        TextView minuteTextView = (TextView) findViewById(R.id.minute);

        hourTextView.setText(String.valueOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)));
        minuteTextView.setText(String.valueOf(Calendar.getInstance().get(Calendar.MINUTE)));

        tickReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals(Intent.ACTION_TIME_TICK)) {
                    hourTextView.setText(String.valueOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)));
                    minuteTextView.setText(String.valueOf(Calendar.getInstance().get(Calendar.MINUTE)));
                }
            }
        };
        registerReceiver(tickReceiver, new IntentFilter(Intent.ACTION_TIME_TICK));
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(tickReceiver);
    }
}