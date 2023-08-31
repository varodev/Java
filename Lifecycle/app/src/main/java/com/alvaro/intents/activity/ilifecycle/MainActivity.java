package com.alvaro.intents.activity.ilifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
//Crea una aplicación en la que para los métodos onCreate, onStart, onResume, onPause, onRestart, onStop y onDestroy
// de la actividad principal escriba por Logcat el nombre del método llamado.
public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"onCreate()");
        //Log.w(TAG,"warning: override onCreate() Method");
        //Log.i(TAG,"information: override onCreate() Method");
        //Log.d(TAG,"debug: override onCreate() Method");
        //Log.v(TAG,"verbose: override onCreate() Method");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e(TAG, "onStart()");
        //Log.w(TAG, "warning: override onStart() Method");
        //Log.i(TAG, "information: override onStart() Method");
        //Log.d(TAG, "debug: override onStart() Method");
        //Log.v(TAG, "verbose: override onStart() Method");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "onResume()");
        //Log.w(TAG, "warning: override onResume() Method");
        //Log.i(TAG, "information: override onResume() Method");
        //Log.d(TAG, "debug: override onResume() Method");
        //Log.v(TAG, "verbose: override onResume() Method");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "onPause()");
        //Log.w(TAG, "warning: override onPause() Method");
        //Log.i(TAG, "information: override onPause() Method");
        //Log.d(TAG, "debug: override onPause() Method");
        //Log.v(TAG, "verbose: override onPause() Method");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e(TAG, "onRestart()");
        //Log.w(TAG, "warning: override onRestart() Method");
        //Log.i(TAG, "information: override onRestart() Method");
        //Log.d(TAG, "debug: override onRestart() Method");
        //Log.v(TAG, "verbose: override onRestart() Method");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG, "onStop()");
        //Log.w(TAG, "warning: override onStop() Method");
        //Log.i(TAG, "information: override onStop() Method");
        //Log.d(TAG, "debug: override onStop() Method");
        //Log.v(TAG, "verbose: override onStop() Method");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"onDestroy()");
        //Log.w(TAG, "warning: override onDestroy() Method");
        //Log.i(TAG, "information: override onDestroy() Method");
        //Log.d(TAG, "debug: override onDestroy() Method");
        //Log.v(TAG, "verbose: override onDestroy() Method");
    }
}