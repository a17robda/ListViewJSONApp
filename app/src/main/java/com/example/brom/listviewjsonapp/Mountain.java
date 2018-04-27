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
    @Override public String toString() {
       String message = name;
                return message;
    }
}
