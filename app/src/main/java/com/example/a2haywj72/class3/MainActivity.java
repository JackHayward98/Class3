package com.example.a2haywj72.class3;

import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends AppCompatActivity {

    MapView mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // This line sets the user agent, a requirement to download OSM maps
        Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences (this));
        setContentView(R.layout.activity_main);

        mv = (MapView)findViewById(R.id.map1);
        mv.setBuiltInZoomControls(true);

        mv.getController().setZoom(16);
        mv.getController().setCenter(new GeoPoint(51.05,-0.72));
    }
}
