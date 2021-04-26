package com.example.videobenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 30/12/2020
    Final Year Project:
    Project: Benchmarks For Many Core Smart Phones
    Project Supervisor: Dr. Dan Grigoras

    Application: Video Benchmark

    Activity purpose:
    - Play a video which has a video resolution/quality of 720p HD

    Goal of this activity/feature:
    - Once the video is playing on either the physical/virtual mobile device, the profiler tool that
    is built into the Android Studio IDE can be used to see how the mobile device is coping with the
    task of having to display/play the video to the user
    - With the profiler tool we are able to see how the following aspects of the mobile device are performing:
    - The CPU
    - The Graphics
    - The Device Battery
    - The Memory


 */
public class SevenTwentyPixelsVideoTest extends AppCompatActivity {

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
        setContentView(R.layout.activity_seven_twenty_pixels_video_test);

        VideoView videoView = findViewById(R.id.video_view_720p);
        String videoPathURL = "android.resource://" + getPackageName() + "/" + R.raw.seventwentypixels;
        Uri uri = Uri.parse(videoPathURL);
        videoView.setVideoURI(uri);

        // Creating a media Controller

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        
    }
}