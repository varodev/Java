package com.juanagui.intents.activity.intents.activity.intents.broadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private BroadcastReceiver tickReceiver;//se hace campo de clase para poder usarla en onStop
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//referencia a componentes visuales
        TextView hourText = (TextView) findViewById(R.id.hour_text);
        TextView minuteText = (TextView) findViewById(R.id.minute_text);
//se inicia en blanco, necesitas tirar de la clase Calendar para meterlo[setText]
        hourText.setText(String.valueOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)));
        minuteText.setText(String.valueOf(Calendar.getInstance().get(Calendar.MINUTE)));

        tickReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().compareTo(Intent.ACTION_TIME_TICK) == 0) {//filtrar cuando recibes intent es el que quieres
                    hourText.setText(String.valueOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)));//cada vez que reciba el broadcast, cambiar la hora
                    minuteText.setText(String.valueOf(Calendar.getInstance().get(Calendar.MINUTE)));
                }
            }
        };
        registerReceiver(tickReceiver, new IntentFilter(Intent.ACTION_TIME_TICK));//Registrar los receptores de broadcast en tiempo de ejecucion
    }                                    //filtro de intent, que intent estas dispuesto a escuchar
    @Override
    public void onStop() {//cuando deje de funcionar la app
        super.onStop();
           if (tickReceiver != null) {
               unregisterReceiver(tickReceiver);//registro el receptor
           }
    }
}
