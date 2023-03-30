package com.DevaNugraha_202102367.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tampilTelepon (View view){
        Intent TeleponIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(TeleponIntent);
    }
    public void tampilSMS (View view){
        Intent smsIntent = new Intent(Intent.ACTION_MAIN);
        smsIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(smsIntent);
    }
    public void tampilKalender (View view){
        Intent KalenderIntent = new Intent(Intent.ACTION_MAIN);
        KalenderIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(KalenderIntent);
    }
    public void tampilBrowser (View view){
        Intent BrowserIntent = new Intent(Intent.ACTION_MAIN);
        BrowserIntent.addCategory(Intent.CATEGORY_APP_BROWSER);
        startActivity(BrowserIntent);
    }
    public void tampilKalkulator (View view){
        Intent KalkulatorIntent = new Intent(Intent.ACTION_MAIN);
        KalkulatorIntent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
        startActivity(KalkulatorIntent);
    }
    public void tampilKontak (View view){
        Intent KontakIntent = new Intent(Intent.ACTION_MAIN);
        KontakIntent.addCategory(Intent.CATEGORY_APP_CONTACTS);
        startActivity(KontakIntent);
    }
    public void tampilGaleri (View view){
        Intent GaleriIntent = new Intent(Intent.ACTION_MAIN);
        GaleriIntent.addCategory(Intent.CATEGORY_APP_GALLERY);
        startActivity(GaleriIntent);
    }
    public void tampilWifi (View view){
        Intent WifiIntent = new Intent(Intent.ACTION_MAIN);
        WifiIntent.addCategory(Settings.ACTION_WIFI_SETTINGS);
        startActivity(WifiIntent);
    }

}