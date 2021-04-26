package com.example.videobenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 30/12/2020
    Final Year Project:
    Project: Benchmarks for many core smart-phones
    Project Supervisor: Dr. Dan Grigoras

    Application: Video Benchmark

    Goal of this activity:
    - To display a video that is of 1080p resolution
    - Being able to use the Profiler tool built into the Android Studio IDE to be able to monitor
    how the device is coping with the task of displaying a video of that resolution
    - I will be using two physical mobile devices and a number of virtual devices
    - The two physical devices I will be using are the Samsung A51 and the Samsung Galaxy J5
    - The virtual devices I will be using are the Google Pixel 3a with API 30

 */
public class OneThousandEightyPixelVideoTest extends AppCompatActivity {

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
        setContentView(R.layout.activity_one_thousand_eighty_pixel_video_test);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPathURL = "android.resource://" + getPackageName() + "/" + R.raw.thousandeightypixels;
        Uri uri = Uri.parse(videoPathURL);
        videoView.setVideoURI(uri);

        // Creating a media controller for the videoView

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }


}