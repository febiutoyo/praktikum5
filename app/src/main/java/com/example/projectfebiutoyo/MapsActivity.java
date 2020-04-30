package com.example.projectfebiutoyo;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng lokasiAnda = new LatLng( -8.2152293,112.6431301);
        mMap.addMarker(new MarkerOptions().position(lokasiAnda).title("Lokasi Anda"));
        LatLng warungpojok = new LatLng(-8.2149038,112.6431344);
        mMap.addMarker(new MarkerOptions().position(warungpojok).title("Warung Pojok").snippet("Ardirejo, Sidorejo, Kec. Pagelaran, Malang, Jawa Timur 65174"));
        LatLng warungsegopedes = new LatLng( -8.2148554,112.6435796);
        mMap.addMarker(new MarkerOptions().position(warungsegopedes).title("Warung Sego Pedes").snippet("Ardirejo, Sidorejo, Kec. Pagelaran, Malang, Jawa Timur 65174"));
        LatLng kopimakcik = new LatLng( -8.2147518,112.6431646);
        mMap.addMarker(new MarkerOptions().position(kopimakcik).title("Kopi Mak Cik").snippet("Jl. Raya Kartini Sidorejo Pagelaran No.17, Ardirejo, Sidorejo, Kec. Pagelaran, Malang, Jawa Timur 65174"));
        LatLng warungasih = new LatLng( -8.2148036,112.6427676);
        mMap.addMarker(new MarkerOptions().position(warungasih).title("Warung Asih").snippet("Jl. Turen Kemulan, Ardirejo, Sidorejo, Kec. Pagelaran, Malang, Jawa Timur 65174"));
        LatLng ayambakar = new LatLng( -8.214716,112.6426355);
        mMap.addMarker(new MarkerOptions().position(ayambakar).title("Warung Ayam Bakar Gencet").snippet("Ardirejo, Sidorejo, Kec. Pagelaran, Malang, Jawa Timur 65174"));
        LatLng bakso = new LatLng( -8.2158097,112.6433852);
        mMap.addMarker(new MarkerOptions().position(bakso).title("Bakso Cak Yung").snippet("Jalan Raya Sidorejo RT19 RW08, Pagelaran, Ardirejo, Sidorejo, Kec. Pagelaran, Malang, Jawa Timur 65174"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasiAnda,14));
    }
}
