package com.example.mapasedesust;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

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