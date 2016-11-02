package com.cari.gadget.bekup.medan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ParseException;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPage(View v) {
        // 1) Possibly check for instance of first
        Button b = (Button)v;
        String namabrand = b.getText().toString();
        Log.d("KODENYA : " , namabrand);
        Intent pindah = new Intent(MainActivity.this, ListPhone.class);
        pindah.putExtra("brand", namabrand);
        startActivity(pindah);
    }

    /*public void goToSamsung(View view) {
        // TODO Auto-generated method stub
        String namabrand =  "samsung";
        Intent pindah = new Intent(MainActivity.this, ListPhone.class);
        pindah.putExtra("brand", namabrand);
        startActivity(pindah);
    }

    public void goToAsus(View view) {
        // TODO Auto-generated method stub
        String  namabrand =  "asus";
        Intent  pindah   = new Intent(MainActivity.this, ListPhone.class);
                pindah.putExtra("brand", namabrand);
        startActivity(pindah);
    }

    public void goToLenovo(View view) {
        // TODO Auto-generated method stub
        String namabrand =  "lenovo";
        Intent pindah = new Intent(MainActivity.this, ListPhone.class);
        pindah.putExtra("brand", namabrand);
        startActivity(pindah);
    }

    public void goToApple(View view) {
        // TODO Auto-generated method stub
        String namabrand =  "apple";
        Intent pindah = new Intent(MainActivity.this, ListPhone.class);
        pindah.putExtra("brand", namabrand);
        startActivity(pindah);
    }*/

}
