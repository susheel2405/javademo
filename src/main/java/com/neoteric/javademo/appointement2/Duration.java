package com.neoteric.javademo.appointement2;

public class Duration {

    private int minutes;

    public Duration(){
        this.minutes = 30;
    }

    public String getDuration(){
        return minutes + "minutes";
    }

}
