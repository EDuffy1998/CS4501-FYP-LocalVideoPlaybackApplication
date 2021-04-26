package com.example.videobenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.net.Uri;

/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 30/12/2020

    Final Year Project:
    Project Title: Benchmarks for Many Core Smart Phones
    Project Supervisor: Dr.Dan Grigoras

    Application: Video Benchmark Application

    Goal/Purpose of this feature:
    - Display a video of a resolution


 */
public class ThreeSixtyVideoTest extends AppCompatActivity {

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
        setContentView(R.layout.activity_three_sixty_video_test);

        VideoView videoview = findViewById(R.id.video_view_360p);
        String videoPathURL = "android.resource://" + getPackageName() + "/" + R.raw.threesixtypixels;
        Uri uri = Uri.parse(videoPathURL);
        videoview.setVideoURI(uri);

        // Creating a mediaController
        MediaController mediaController = new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);

    }
}