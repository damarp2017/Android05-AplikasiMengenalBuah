package com.damar.mobile05_aplikasimengenalbuah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    TextView namaBuah;
    ImageView gambarBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namaBuah = getIntent().getStringExtra(Konstanta.DATANAMA);
        int gambarBuah = getIntent().getIntExtra(Konstanta.DATAGAMBAR, 0);


        this.namaBuah = findViewById(R.id.namaBuah);
        this.gambarBuah = findViewById(R.id.gambarBuah);

        this.namaBuah.setText(namaBuah);
        this.gambarBuah.setImageResource(gambarBuah);

    }
}
