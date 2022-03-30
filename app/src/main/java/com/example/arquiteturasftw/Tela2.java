package com.example.arquiteturasftw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.arquiteturasftw.databinding.ActivityTela2Binding;

import java.util.List;

public class Tela2 extends AppCompatActivity {

    private ActivityTela2Binding binding;
    private MainActivity.MyBroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTela2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra("TELA", "Tela 2");
        startService(intent);

        binding.btnTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Tela3.class);
                startActivity(intent);
            }
        });

        List<MyContact> contacts = ContactsHelper.getContacts(this);

        if (contacts.size() >= 2) {
            contacts.get(1);
        }
    }
}