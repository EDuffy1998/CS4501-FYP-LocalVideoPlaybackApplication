package com.example.videobenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 30/12/2020
    Final Year Project:
    Project Name: Benchmarks for many core smart-phones
    Project Supervisor: Dr. Dan Grigoras

    Application: This is an application which plays videos of various resolutions/quality such as 360p to 1080p

    Why I feel this an important benchmark:
    - I feel that testing to see how a mobile device copes
      when asked to play video is an important feature to test because with streaming becoming the
      conventional way to watch media its important to see how your device 


    Goals of this applications:
    - main goal of this application is to see how the quality of the video being displayed by the
    mobile device has an effect on the CPU, Memory and Battery
    - What I hope to find is that the higher the resolution/quality being displayed that more energy
    is being consumed by the device and the CPU is being used more

    Videos: How they were obtained and used
    - I found non copyright videos/free to use and I obtained the same video in various different
    resolution quality.
    - I wanted to be able to test across the spectrum of resolutions from 144p - 1080p
    - It's important as well that the video is short as it's easier to observe/test and obtain results
    - Since some mobile devices have more higher spec than others it needed to be demonstrated that
    if you had an average/middle of the range phone that while wanting to watch stuff in higher quality
    is an option presented to you on apps such as YouTube, that it's not always the best thing to do.

    How are results found/obtained:
    - Since I don't have many physical mobile devices to test on

    Purpose of the MainActivity:
    - The purpose of the MainActivity is to present the user a view in which they can choose to watch
    a video
    - The user will have the choice of going to various activities where they can watch videos in
    resolutions/qualities such as:
    - 144p
    - 240p
    - 360p
    - 480p
    - 720p
    - 1080p

 */
public class MainActivity extends AppCompatActivity {

    /*
      First activity presented to the end-user when they open the application
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Method to handle button press when user selects resolution of 144p
        Text bubble is created informing the user of their decision/selection using Toast.makeText
        Intent created mapping to activity containing the resolution of video chosen
        intent passed as input to startActivity method, user is brought to next activity
     */
    public void onefourtypixelVideoTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to 144p Video Test",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),OneHunderedFourtyPixelVideoTest.class);
        startActivity(myIntent);
    }

    /*
        Method to handle button press when user selects resolution of 240p
        Text bubble is created informing the user of their decision/selection using Toast.makeText
        Intent created mapping to activity containing the resolution of video chosen
        intent passed as input to startActivity method, user is brought to next activity
     */
    public void twofourtypixelVideoTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to 240p Video Test",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),TwoFourtyPixelVideoTest.class);
        startActivity(myIntent);

    }

    /*
        Method to handle button press when user selects resolution of 360p
        Text bubble is created informing the user of their decision/selection using Toast.makeText
        Intent created mapping to activity containing the resolution of video chosen
        intent passed as input to startActivity method, user is brought to next activity
     */
    public void threesixtypixelVideoTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to 144p Video Test",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),ThreeSixtyVideoTest.class);
        startActivity(myIntent);
    }

    /*
        Method to handle button press when user selects resolution of 480p
        Text bubble is created informing the user of their decision/selection using Toast.makeText
        Intent created mapping to activity containing the resolution of video chosen
        intent passed as input to startActivity method, user is brought to next activity
     */
    public void FourEightyVideoTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to 144p Video Test",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),FourTwentyPixelsVideoTest.class);
        startActivity(myIntent);
    }

    /*
        Method to handle button press when user selects resolution of 720p
        Text bubble is created informing the user of their decision/selection using Toast.makeText
        Intent created mapping to activity containing the resolution of video chosen
        intent passed as input to startActivity method, user is brought to next activity
     */
    public void SevenTwentyVideoTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to 144p Video Test",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),SevenTwentyPixelsVideoTest.class);
        startActivity(myIntent);

    }

    /*
        Method to handle button press when user selects resolution of 1080p
        Text bubble is created informing the user of their decision/selection using Toast.makeText
        Intent created mapping to activity containing the resolution of video chosen
        intent passed as input to startActivity method, user is brought to next activity
     */
    public void ThousandEightyPixelVideoTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to 144p Video Test",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),OneThousandEightyPixelVideoTest.class);
        startActivity(myIntent);
    }


}