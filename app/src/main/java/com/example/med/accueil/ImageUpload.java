package com.example.med.accueil;

/**
 * Created by MED on 06/04/2017.
 */

public class ImageUpload {
    public  String name;
    public  String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url) {
        this.name = name;
        this.url = url;
    }
    public ImageUpload(){}
}
