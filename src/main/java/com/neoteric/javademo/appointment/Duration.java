package com.neoteric.javademo.appointment;

public class Duration {

    private int hours;
    private int minutes;

    public Duration(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }


    public String getDuration(){
        return hours + "hours" + minutes + "minutes";
    }
}
