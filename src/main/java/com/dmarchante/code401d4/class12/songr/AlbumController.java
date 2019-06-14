package com.dmarchante.code401d4.class12.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;


    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @GetMapping("/albums/new")
    public String getAddAlbumForm() {
        return "albumForm";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam String albumTitle, @RequestParam String artist, @RequestParam int songCount, @RequestParam int length, @RequestParam String url) {
        Album album = new Album(albumTitle, artist, songCount, length, url);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

    @GetMapping("/album/{id}")
    public String getAlbum(@PathVariable long id, Model m) {
        Album album = albumRepository.findById(id).get();
        m.addAttribute("album", album);
        return "albumDetail";
    }

    @PostMapping("/songs")
    public RedirectView addSong(@RequestParam Long id, @RequestParam String songTitle, @RequestParam int length, int track) {
        Album album = albumRepository.findById(id).get();
        Song song = new Song(album, songTitle, length, track);
        songRepository.save(song);
        return new RedirectView("/albums");
    }
}
