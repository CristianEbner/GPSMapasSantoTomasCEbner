package com.example.mapasedesust;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//video
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLatitud, txtLongitud;

    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud=findViewById(R.id.txt_Latitud);
        txtLongitud=findViewById(R.id.txt_Longitud);
        SupportMapFragment mapFragment =(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        //Sede Arica
        LatLng SedeArica = new LatLng(-18.48337538951066, -70.31037542996377);
        mMap.addMarker(new MarkerOptions().position(SedeArica).title("Sede UST Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeArica));

        //Sede Iquique
        LatLng SedeIquique = new LatLng(-20.219266021510602, -70.14074200206663);
        mMap.addMarker(new MarkerOptions().position(SedeIquique).title("Sede UST Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeArica));

        //Sede Antofagasta
        LatLng SedeAntofagasta = new LatLng(-23.634720097973915, -70.39405286766186);
        mMap.addMarker(new MarkerOptions().position(SedeAntofagasta).title("Sede UST Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeAntofagasta));

        //Sede La Serena
        LatLng SedeLaSerena = new LatLng(-29.90157326671617, -71.26023740620494);
        mMap.addMarker(new MarkerOptions().position(SedeLaSerena).title("Sede UST La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeLaSerena));

        //Sede Viña del Mar
        LatLng SedeVinaDelMar = new LatLng(-33.03758108163345, -71.52211324876929);
        mMap.addMarker(new MarkerOptions().position(SedeVinaDelMar).title("Sede UST Viña del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeVinaDelMar));

        //Sede Santiago
        LatLng SedeSantiago = new LatLng(-33.4489617216922, -70.66078202426755);
        mMap.addMarker(new MarkerOptions().position(SedeSantiago).title("Sede UST Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeSantiago));

        //Sede Talca
        LatLng SedeTalca = new LatLng(-35.42869549498688, -71.67291205407375);
        mMap.addMarker(new MarkerOptions().position(SedeTalca).title("Sede UST Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeTalca));

        //Sede Concepcion
        LatLng SedeConcepcion = new LatLng(-36.8263298887165, -73.06162325725009);
        mMap.addMarker(new MarkerOptions().position(SedeConcepcion).title("Sede UST Concepcion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeConcepcion));

        //Sede Los Angeles
        LatLng SedeLosAngeles = new LatLng(-37.472044724568455, -72.35399635768657);
        mMap.addMarker(new MarkerOptions().position(SedeLosAngeles).title("Sede UST Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeLosAngeles));

        //Sede Temuco
        LatLng SedeTemuco = new LatLng(-38.73465032325313, -72.60197763992015);
        mMap.addMarker(new MarkerOptions().position(SedeTemuco).title("Sede UST Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeTemuco));

        //Sede Valdivia
        LatLng SedeValdivia = new LatLng(-39.81740956457223, -73.23313281731664);
        mMap.addMarker(new MarkerOptions().position(SedeValdivia).title("Sede UST Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeValdivia));

        //Sede Osorno
        LatLng SedeOsorno = new LatLng(-40.57177965853787, -73.13771672699325);
        mMap.addMarker(new MarkerOptions().position(SedeOsorno).title("Sede UST Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedeOsorno));

        //Sede Puerto Montt
        LatLng SedePuertoMontt = new LatLng(-41.47280365142193, -72.92882988810135);
        mMap.addMarker(new MarkerOptions().position(SedePuertoMontt).title("Sede UST Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SedePuertoMontt));
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
    public class VideoUST extends AppCompatActivity {

        private VideoView video;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_video_ust);

            video = findViewById(R.id.videoView);

            String videoUrl = "https://drive.google.com/file/d/1qoKOx7GZo3HJA6AvwqytJD3yRnO9i07z/view?usp=drive_link";

            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(video);
            video.setMediaController(mediaController);

            video.setVideoURI(Uri.parse(videoUrl));

            video.start();
        }
    }
}