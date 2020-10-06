package com.example.proyek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LihatPengeluaran extends AppCompatActivity {

    private ListView listPengeluaran;
    private ArrayAdapter<String> adapterPengeluaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_pengeluaran);
        this.listPengeluaran = this.findViewById(R.id.listview);

        this.adapterPengeluaran = new ArrayAdapter<>(
                this,
                R.layout.list_view_lihat_pengeluaran,
                MainActivity.datapengeluaran
        );
        this.listPengeluaran.setAdapter(this.adapterPengeluaran);
    }
}