package com.damar.mobile05_aplikasimengenalbuah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdaper extends ArrayAdapter {
    private Context context;
    private String[] namaBuah;
    private int[] gambarBuah;

    public CustomListAdaper(Context context, String[] namaBuah, int[] gambarBuah) {
        super(context, R.layout.itembuah, namaBuah);
        this.context = context;
        this.namaBuah = namaBuah;
        this.gambarBuah = gambarBuah;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater;

        View view = LayoutInflater.from(context).inflate(R.layout.itembuah, parent, false);

        TextView namaBuah = view.findViewById(R.id.namaBuah);
        ImageView gambarBuah = view.findViewById(R.id.gambarBuah);

        namaBuah.setText(this.namaBuah[position]);
        gambarBuah.setImageResource(this.gambarBuah[position]);

        return view;
    }
}
