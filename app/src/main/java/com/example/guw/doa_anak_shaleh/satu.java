package com.example.guw.doa_anak_shaleh;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class satu extends AppCompatActivity {

    public static String key_data = "data" ;
    private String terima_data = null;
    TextView txJudul, txArab, txIndo, txArti;
    String judul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);

        txJudul = (TextView) findViewById(R.id.txt_Judul);
        txArab = (TextView) findViewById(R.id.tv_arab);
        txIndo = (TextView) findViewById(R.id.tv_indo);
        txArti = (TextView) findViewById(R.id.tv_Arti);
        judul = txJudul.getText().toString();

        terima_data = getIntent().getStringExtra(key_data);
        txJudul.setText(terima_data);


        //  if (txJudul.getText().equals("Do'a Sesudah Makan")) {

        if (txJudul.getText().equals("Do'a Untuk Kedua Orang Tua")) {

            txArab.setText(R.string.doa_arab);
            txIndo.setText(R.string.doa_indo);
            txArti.setText(R.string.doa_arti);

        }else if (txJudul.getText().equals("Do'a Sebelum Makan")) {

            txArab.setText(R.string.doa_arab2);
            txIndo.setText(R.string.doa_indo2);
            txArti.setText(R.string.doa_arti2);


        }else if (txJudul.getText().equals("Do'a Sesudah Makan")) {

            txArab.setText(R.string.doa_arab3);
            txIndo.setText(R.string.doa_indo3);
            txArti.setText(R.string.doa_arti3);

        }else if (txJudul.getText().equals("Do'a Sebelum Tidur")) {

            txArab.setText(R.string.doa_arab4);
            txIndo.setText(R.string.doa_indo4);
            txArti.setText(R.string.doa_arti4);

        } else if (txJudul.getText().equals("Do'a Bangun Tidur")) {

            txArab.setText(R.string.doa_arab5);
            txIndo.setText(R.string.doa_indo5);
            txArti.setText(R.string.doa_arti5);

        } else if (txJudul.getText().equals("Do'a Masuk Kamar Mandi")) {

            txArab.setText(R.string.doa_arab6);
            txIndo.setText(R.string.doa_indo6);
            txArti.setText(R.string.doa_arti6);

        } else if (txJudul.getText().equals("Do'a Keluar Kamar Mandi")) {

            txArab.setText(R.string.doa_arab7);
            txIndo.setText(R.string.doa_indo7);
            txArti.setText(R.string.doa_arti7);

        } else if (txJudul.getText().equals("Do'a Pembuka Hati")) {

            txArab.setText(R.string.doa_arab8);
            txIndo.setText(R.string.doa_indo8);
            txArti.setText(R.string.doa_arti8);

        } else if (txJudul.getText().equals("Do'a Sebelum Belajar")) {

            txArab.setText(R.string.doa_arab9);
            txIndo.setText(R.string.doa_indo9);
            txArti.setText(R.string.doa_arti9);

        } else if (txJudul.getText().equals("Do'a Sesudah Belajar")) {

            txArab.setText(R.string.doa_arab10);
            txIndo.setText(R.string.doa_indo10);
            txArti.setText(R.string.doa_arti10);

        } else if (txJudul.getText().equals("Do'a Memakai Pakaian")) {

            txArab.setText(R.string.doa_arab11);
            txIndo.setText(R.string.doa_indo11);
            txArti.setText(R.string.doa_arti11);

        } else if (txJudul.getText().equals("Do'a Melepas Pakaian")) {

            txArab.setText(R.string.doa_arab12);
            txIndo.setText(R.string.doa_indo12);
            txArti.setText(R.string.doa_arti12);

        } else if (txJudul.getText().equals("Do'a Ketika Bercermin")) {

            txArab.setText(R.string.doa_arab13);
            txIndo.setText(R.string.doa_indo13);
            txArti.setText(R.string.doa_arti13);

        } else if (txJudul.getText().equals("Do'a Ketika Menyisir Rambut")) {

            txArab.setText(R.string.doa_arab14);
            txIndo.setText(R.string.doa_indo14);
            txArti.setText(R.string.doa_arti14);

        } else if (txJudul.getText().equals("Do'a Masuk Rumah")) {

            txArab.setText(R.string.doa_arab15);
            txIndo.setText(R.string.doa_indo15);
            txArti.setText(R.string.doa_arti15);

        } else if (txJudul.getText().equals("Do'a Keluar Rumah")) {

            txArab.setText(R.string.doa_arab16);
            txIndo.setText(R.string.doa_indo16);
            txArti.setText(R.string.doa_arti16);

        } else if (txJudul.getText().equals("Do'a Naik Kendaraan")) {

            txArab.setText(R.string.doa_arab17);
            txIndo.setText(R.string.doa_indo17);
            txArti.setText(R.string.doa_arti17);

        } else if (txJudul.getText().equals("Do'a Masuk Mesjid")) {

            txArab.setText(R.string.doa_arab18);
            txIndo.setText(R.string.doa_indo18);
            txArti.setText(R.string.doa_arti18);

        } else if (txJudul.getText().equals("Do'a Keluar Mesjid")) {

            txArab.setText(R.string.doa_arab19);
            txIndo.setText(R.string.doa_indo19);
            txArti.setText(R.string.doa_arti19);

        } else if (txJudul.getText().equals("Do'a Sebelum Wudhu")) {

            txArab.setText(R.string.doa_arab20);
            txIndo.setText(R.string.doa_indo20);
            txArti.setText(R.string.doa_arti20);

        } else if (txJudul.getText().equals("Do'a Sesudah Wudhu")) {

            txArab.setText(R.string.doa_arab21);
            txIndo.setText(R.string.doa_indo21);
            txArti.setText(R.string.doa_arti21);

        } else if (txJudul.getText().equals("Niat Wudhu")) {

            txArab.setText(R.string.doa_arab22);
            txIndo.setText(R.string.doa_indo22);
            txArti.setText(R.string.doa_arti22);

        } else if (txJudul.getText().equals("Do'a Kebaikan Dunia Akhirat")) {

            txArab.setText(R.string.doa_arab23);
            txIndo.setText(R.string.doa_indo23);
            txArti.setText(R.string.doa_arti23);

        } else if (txJudul.getText().equals("Do'a Ketika Turun Hujan")) {

            txArab.setText(R.string.doa_arab24);
            txIndo.setText(R.string.doa_indo24);
            txArti.setText(R.string.doa_arti24);

        } else if (txJudul.getText().equals("Do'a Ketika Ada Petir")) {

            txArab.setText(R.string.doa_arab25);
            txIndo.setText(R.string.doa_indo25);
            txArti.setText(R.string.doa_arti25);

        } else if (txJudul.getText().equals("Do'a Ketika Angin Kencang")) {

            txArab.setText(R.string.doa_arab26);
            txIndo.setText(R.string.doa_indo26);
            txArti.setText(R.string.doa_arti26);

        }

    }

}


//  MediaPlayer player;

//public void onReceive (Context c, Intent arg1) {

//        player = MediaPlayer.create(c, R.raw.doa_orgtua);
//      player.start();

//  }