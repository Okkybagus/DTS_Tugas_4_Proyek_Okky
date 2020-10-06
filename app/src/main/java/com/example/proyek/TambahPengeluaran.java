package com.example.proyek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TambahPengeluaran extends AppCompatActivity {
    EditText edtketerangan, edtnominal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_pengeluaran);

        this.edtketerangan = this.findViewById(R.id.edt_keterangan);
        this.edtnominal = this.findViewById(R.id.edt_nominal);
    }

    public void btnSimpan(View view) {
        String keterangan = this.edtketerangan.getText().toString();
        String nominal = this.edtnominal.getText().toString();

        if (isAngka(nominal)){
            String pengeluaran= keterangan + " - Rp " + nominal;
            MainActivity.datapengeluaran.add(pengeluaran);

            Toast.makeText(this, "Data Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Data Gagal", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isAngka(String nominal) {
        try {
            Double.parseDouble(nominal);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }



}