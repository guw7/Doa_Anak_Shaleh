package com.example.guw.doa_anak_shaleh;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class utama extends AppCompatActivity {

    private ViewStub stubGrid;
    private ViewStub stubList;
    private ListView listView;
    private GridView gridView;
    private LIstViewAdapter lIstViewAdapter;
    private GridViewAdapter gridViewAdapter;
    private List <doa> doaList;
    private int currentViewMode = 0;
    private String strInn;

    static final int VIEW_MODE_LISTVIEW = 0;
    static final int VIEW_MODE_GRIDVIEW = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        Intent intent;

        stubList = (ViewStub) findViewById(R.id.stub_list);
        stubGrid = (ViewStub) findViewById(R.id.stub_grid);

        stubList.inflate();
        stubGrid.inflate();

        listView = (ListView) findViewById(R.id.mylistview);
        gridView = (GridView) findViewById(R.id.mygridview);

        //Mengambil doa
        getDoaList();

        SharedPreferences sharedPreferences = getSharedPreferences("ViewMode", MODE_PRIVATE);
        currentViewMode = sharedPreferences.getInt("currentViewMode", VIEW_MODE_LISTVIEW);

        listView.setOnItemClickListener(onItemClick);
        gridView.setOnItemClickListener(onItemClick);

        switchView();

    }

    private void switchView() {

        if (VIEW_MODE_LISTVIEW == currentViewMode) {
            //Tampilkan ListView
            stubList.setVisibility(View.VISIBLE);
            //Sembunyikan GridView
            stubGrid.setVisibility(View.GONE);

        } else {
            //Sembunyikan ListView
            stubList.setVisibility(View.GONE);
            //Tampilkan GridView
            stubGrid.setVisibility(View.VISIBLE);
        }
        setAdapters();
    }

    private void setAdapters() {

        if (VIEW_MODE_LISTVIEW == currentViewMode) {
            lIstViewAdapter = new LIstViewAdapter(this, R.layout.list_item, doaList);
            listView.setAdapter(lIstViewAdapter);

        } else {
            gridViewAdapter = new GridViewAdapter(this, R.layout.list_item, doaList);
            gridView.setAdapter(gridViewAdapter);
        }
    }

    public List<doa> getDoaList() {

        doaList = new ArrayList<>();
        doaList.add(new doa(R.drawable.img1, "Do'a Untuk Kedua Orang Tua"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Sebelum Makan"));
        doaList.add(new doa(R.drawable.img1, "Do'a Sesudah Makan"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Sebelum Tidur"));
        doaList.add(new doa(R.drawable.img1, "Do'a Bangun Tidur"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Masuk Kamar Mandi"));
        doaList.add(new doa(R.drawable.img1, "Do'a Keluar Kamar Mandi"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Pembuka Hati"));
        doaList.add(new doa(R.drawable.img1, "Do'a Sebelum Belajar"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Sesudah Belajar"));
        doaList.add(new doa(R.drawable.img1, "Do'a Memakai Pakaian"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Melepas Pakaian"));
        doaList.add(new doa(R.drawable.img1, "Do'a Ketika Bercermin"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Ketika Menyisir Rambut"));
        doaList.add(new doa(R.drawable.img1, "Do'a Masuk Rumah"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Keluar Rumah"));
        doaList.add(new doa(R.drawable.img1, "Do'a Naik Kendaraan"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Masuk Mesjid"));
        doaList.add(new doa(R.drawable.img1, "Do'a Keluar Mesjid"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Sebelum Wudhu"));
        doaList.add(new doa(R.drawable.img1, "Do'a Sesudah Wudhu"));
        doaList.add(new doa(R.drawable.icon_android, "Niat Wudhu"));
        doaList.add(new doa(R.drawable.img1, "Do'a Kebaikan Dunia Akhirat"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Ketika Turun Hujan"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Ketika Ada Petir"));
        doaList.add(new doa(R.drawable.icon_android, "Do'a Ketika Angin Kencang"));


        return doaList;
    }

    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getApplicationContext(), doaList.get(position).getJudul(), Toast.LENGTH_SHORT).show();

            //Metode Intent
            strInn = doaList.get(position).getJudul().toString();
            Intent intent = new Intent(utama.this, satu.class);

            intent.putExtra(satu.key_data,strInn);
            startActivityForResult(intent, 0);

        }
    };



    //BAGIAN MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.item_menu:
                if (VIEW_MODE_LISTVIEW == currentViewMode) {
                    currentViewMode = VIEW_MODE_GRIDVIEW;

                } else {
                    currentViewMode = VIEW_MODE_LISTVIEW;
                }

                //Tampilan Switch
                switchView();

                //menyimpan mode tampilan di dalam share reference
                SharedPreferences sharedPreferences = getSharedPreferences("ViewMode", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("currentViewMode", currentViewMode);
                editor.commit();

                break;
        }

        return true;
    }
}