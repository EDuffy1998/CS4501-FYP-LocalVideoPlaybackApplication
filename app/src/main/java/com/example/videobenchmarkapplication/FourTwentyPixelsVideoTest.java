package com.example.videobenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class FourTwentyPixelsVideoTest extends AppCompatActivity {

    /*
        Activity is loaded from user prompt
        User interface is loaded & presented to the user
        VideoView is initialized and assigned the value of the screen component
        Variable containing the URL path to the video is created
        URL is parsed using URI
        VideoView is assigned that video content to output
        MediaController is initialized, allows user to interact with video content by pausing,resuming & fast forward
        mediaController position is set using the AnchorView to default 0,0
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_twenty_pixels_video_test);

        VideoView videoView = findViewById(R.id.video_view_420p);
        String videoPathURL = "android.resource://" + getPackageName() + "/" + R.raw.foureightypixels;
        Uri uri = Uri.parse(videoPathURL);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}