package com.dmarchante.code401d4.class12.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    int length;
    String url;

    public Album() {}

    public Album(String title, String artist, int songCount, int length, String url) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.url = url;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getSongCount() {
        return this.songCount;
    }

    public int getLength() {
        return this.length;
    }

    public String getUrl() {
        return this.url;
    }
}
