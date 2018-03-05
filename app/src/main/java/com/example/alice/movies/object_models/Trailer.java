package com.example.alice.movies.object_models;

/**
 * Created by alice on 3/5/18.
 */

public class Trailer {
    public String id;
    public String key;
    public String name;
    public String site;

    public Trailer(String id, String key, String name, String site) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.site = site;
    }
}
