package com.example.guw.doa_anak_shaleh;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by guw on 07/05/17.
 */

public class LIstViewAdapter extends ArrayAdapter <doa> {


    public LIstViewAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<doa> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;

        if (null == v) {
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_item, null);
        }

        doa doa = getItem(position);
        ImageView icon = (ImageView) v.findViewById(R.id.id_icon);
        TextView txt_judul = (TextView) v.findViewById(R.id.txt_Title);

        icon.setImageResource(doa.getIdGambar());
        txt_judul.setText(doa.getJudul());

        return v;
    }
}
