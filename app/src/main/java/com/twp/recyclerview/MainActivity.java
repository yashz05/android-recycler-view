package com.twp.recyclerview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rec);


        contact_model[] cml = new contact_model[50];

        for (int i = 0; i < 50; i++) {
            contact_model cm = new contact_model();
            Random r = new Random();
            char c = (char)(r.nextInt(26) + 'a');
            cm.Name = c+"ash ";
            cm.pno = "9833033" + 400 + i;
            cml[i] = cm;
        }

        contacta ad = new contacta(cml);
        rcv.setAdapter(ad);
        Log.d("TAG", String.valueOf(ad.getItemCount()));
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setOnClickListener((e -> {
            Log.d("TAG", "onCreate: " + e);
        }));


    }
}