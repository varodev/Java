package com.alvaro.intents.activity.impliclit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
//Crear una aplicación que permita mostrar una dirección en Google Maps mediante Intents implícitos.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText addressEditText=(EditText)findViewById(R.id.address);
        addressEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionID, KeyEvent keyEvent) {
                if(actionID == EditorInfo.IME_ACTION_GO || actionID == EditorInfo.IME_ACTION_DONE || actionID == EditorInfo.IME_ACTION_NEXT ){
                    String address = addressEditText.getText().toString();
                    String urlEncoded = Uri.encode(address);
                    String uriString = "geo:0,0?q="+urlEncoded;
                    Uri uri = Uri.parse(uriString);

                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                    return true;
                }
                return false;
            }
        });
    }
}