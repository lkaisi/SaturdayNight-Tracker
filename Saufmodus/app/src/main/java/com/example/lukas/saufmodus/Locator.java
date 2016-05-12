package com.example.lukas.saufmodus;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

/**
 * Created by Lukas on 12.05.2016. (C) Lukas Kaisermayr
 */
public class Locator extends Activity implements LocationListener {

    private LocationManager locMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        locMan = (LocationManager) getSystemService(LOCATION_SERVICE);
    }

    private void saveData (){
        //while (not picked end time)

        Location amk = getGPS();

        //In DB schreiben
    }

    private Location getGPS() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // AMK SCHEIß ANDROID 6
        }
        //locMan.requestLocationUpdates(LocationManager.GPS_PROVIDER, 600000, 0, this);
        Location loc = locMan.getLastKnownLocation(LOCATION_SERVICE);

        return loc;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
