package com.falvojr.gs.beacon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Projeto base para o consumo da API de Beacons usando a biblioteca Retrofit.
 *
 * @author falvojr
 * @see <a href="https://developers.google.com/beacons/proximity/get-started">Get Started</a>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
