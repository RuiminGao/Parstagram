package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VPnky59hDdc0dy2eebwgvoe7lwzO55cFEyzPLO9o")
                .clientKey("6jaTgAUDqAbVeVR9EmXBYJefJH7xuYq31dKl9Q7s")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
