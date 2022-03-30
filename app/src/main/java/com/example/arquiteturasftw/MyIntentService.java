package com.example.arquiteturasftw;

import android.app.IntentService;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class MyIntentService extends IntentService {

    String name;

    public MyIntentService() {
        super("MyIntentService");
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onHandleIntent(Intent intent) {

        if (intent != null) {
            String name = intent.getStringExtra("TELA");
            Toast.makeText(this, "Nome da Tela: " + name, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("APS", "Service on destroy");
    }
}