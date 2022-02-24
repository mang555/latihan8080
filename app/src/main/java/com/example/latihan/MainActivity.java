package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, PerpusActivity.class);
        startActivity(intent);
    }

    public void eskul(View view) {
        Intent intent = new Intent(MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }
}