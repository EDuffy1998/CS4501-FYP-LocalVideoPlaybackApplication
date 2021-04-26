package com.example.videobenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 31/12/2020
    Final Year Project:
    Project Name: Benchmarks For Many Core Smart Phones
    Project Supervisor: Dr. Dan Grigoras

    Application: Video Benchmark Application

    Purpose of this feature:
    - Display a video that has a resolution quality of 240p

    How data is obtained on how the mobile device is coping with the tasks
    - Use the android profiler tool which is built into the Android Studio IDE
    - The Profiler allows for the monitoring of the following when a task is running:
    - CPU
    - Memory usage
    - Battery usage
    - Graphics


 */
public class TwoFourtyPixelVideoTest extends AppCompatActivity {

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
        setContentView(R.layout.activity_two_fourty_pixel_video_test);

        VideoView videoView = findViewById(R.id.video_view_240p);
        String videoPathURL = "android.resource://" + getPackageName()  + "/" + R.raw.twofourtypixels;
        Uri uri = Uri.parse(videoPathURL);
        videoView.setVideoURI(uri);

        // Creating a media Controller

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}