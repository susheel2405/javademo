package com.neoteric.javademo.bookmyshow;

public class Movies {

    private String name;
    private String timing;


    public Movies(String name, String timing){
        this.name = name;
        this.timing = timing;
    }

    public String getName(){
        return name;
    }

    public String getTiming(){
        return  timing;
    }

    public String toString(){
        return name + "at" + timing;
    }

}
