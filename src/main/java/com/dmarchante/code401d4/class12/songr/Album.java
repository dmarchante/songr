package com.dmarchante.code401d4.class12.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String albumTitle;
    private String artist;
    private int songCount;
    private int length;
    private String url;

    @OneToMany(mappedBy = "album")
    private List<Song> songs;

    public Album() {}

    public Album(String albumTitle, String artist, int songCount, int length, String url) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.url = url;
    }

    public long getId() { return this.id; }

    public String getAlbumTitle() { return this.albumTitle; }

    public String getArtist() { return this.artist; }

    public int getSongCount() {
        return this.songCount;
    }

    public int getLength() {
        return this.length;
    }

    public String getUrl() {
        return this.url;
    }

    public List<Song> getSongs() { return this.songs; }
}
