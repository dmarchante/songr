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
    private int length;
    private int track;

    public Song() {}

    public Song(Album album, String songTitle, int length, int track) {
        this.album = album;
        this.songTitle = songTitle;
        this.length = length;
        this.track = track;
    }

    public long getId() { return this.id; }

    public Album getAlbum() { return this.album; }

    public String getSongTitle() { return this.songTitle; }

    public int getLength() { return this.length; }

    public int gettrack() { return this.track; }
}
