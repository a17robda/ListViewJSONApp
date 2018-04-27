package com.example.brom.listviewjsonapp;


public class Mountain {

    private String name;
    private String location;
    private String height;
    private String imgUrl;

    public Mountain(String inName, String inLocation, String inHeight, String inImgUrl) {
        this.name = inName;
        this.location = inLocation;
        this.height = inHeight;
        this.imgUrl = inImgUrl;
    }
    /*@Override public String toString() {
       return name;
    }*/
    public String nameGet() {
        return name;
    }
    public String messageGet() {
        return name + " is located at: " + location  + "\n" + " and has a height of: " + height + "m";
    }
}
