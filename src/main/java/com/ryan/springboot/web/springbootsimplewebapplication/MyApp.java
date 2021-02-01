package com.ryan.springboot.web.springbootsimplewebapplication;

public class MyApp {

    public static void main(String[] args)
    {
        Coach Coach = new TrackCoach();
        System.out.println(Coach.getDailyWorkout());
    }
}
