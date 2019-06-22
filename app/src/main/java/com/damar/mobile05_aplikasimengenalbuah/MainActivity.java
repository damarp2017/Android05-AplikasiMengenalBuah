package com.damar.mobile05_aplikasimengenalbuah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] namaBuah = {
            "Alpukat", "Apel", "Cherry", "Durian", "Jambu Air", "Manggis", "Strawberry",
    };

    int[] gambarBuah = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry,
    };

    int[] suaraBuah = {
            R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambuair,
            R.raw.manggis,
            R.raw.strawberry,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        CustomListAdaper adapter = new CustomListAdaper(MainActivity.this, namaBuah, gambarBuah);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer.create(MainActivity.this, suaraBuah[position]).start();

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(Konstanta.DATANAMA, namaBuah[position]);
                intent.putExtra(Konstanta.DATAGAMBAR, gambarBuah[position]);
                startActivity(intent);
            }
        });
    }
}
