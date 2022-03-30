package com.example.arquiteturasftw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.arquiteturasftw.databinding.ActivityTela3Binding;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class Tela3 extends AppCompatActivity {

    private ActivityTela3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTela3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra("TELA", "Tela 3");
        startService(intent);

        binding.btnTela4.setOnClickListener(view ->
                Snackbar.make(view, "Não existe a tela 4 por enquanto", Snackbar.LENGTH_LONG).show()
        );

        List<MyContact> contacts = ContactsHelper.getContacts(this);

        if (contacts.size() >= 3){
            contacts.get(2);
        }
    }
}