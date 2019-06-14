package com.dmarchante.code401d4.class12.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Album album;

    private String songTitle;

    public Song() {}


    public Song(Album album, String songTitle) {
        this.album = album;
        this.songTitle = songTitle;
    }

    public long getId() { return this.id; }

    public Album getAlbum() { return this.album; }

    public String getSongTitle() { return this.songTitle; }
}
