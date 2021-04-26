package com.example.videobenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 31/12/2020
    Final Year Project:
    Project: Benchmarks for Many Core Smart phones
    Project Supervisor: Dr. Dan Grigoras

    Application: Video Benchmark Application

    Purpose Feature/Activity:
    - To be able to display a video of quality/resolution of 144p

    How data is obtained:
    - I will be using the Android Profiler tool which is built into the Android Studio IDE
    - The profiler tool will allow me to monitor the following:
    - CPU
    - Battery
    - Graphics
    - Memory
 */

public class OneHunderedFourtyPixelVideoTest extends AppCompatActivity {

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
        setContentView(R.layout.activity_one_hundered_fourty_pixel_video_test);

        VideoView videoView = findViewById(R.id.video_view_144p);
        String videoPathURL = "android.resource://" + getPackageName() + "/" + R.raw.onehundredfourtyfourpixels;
        Uri uri = Uri.parse(videoPathURL);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}