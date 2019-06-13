package com.dmarchante.code401d4.class12.songr;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.stream.Stream;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

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
    public RedirectView addAlbum(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount, @RequestParam int length, @RequestParam String url) {
        Album album = new Album(title, artist, songCount, length, url);
        albumRepository.save(album);
        return new RedirectView("/albums");

    }


}
