package com.example.proyek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> datapengeluaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(datapengeluaran == null){
            datapengeluaran = new ArrayList<>();
            datapengeluaran.add("Menu Makanan");
            datapengeluaran.add("Nasi Goreng - Rp 12.000");
        }
    }

    public void btnTmbhPengeluaran(View view) {
        Intent i = new Intent(MainActivity.this, TambahPengeluaran.class);
        startActivity(i);
    }

    public void btnLihatPengeluaran(View view) {
        Intent i = new Intent(MainActivity.this, LihatPengeluaran.class);
        startActivity(i);
    }
}