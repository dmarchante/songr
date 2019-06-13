package com.dmarchante.code401d4.class12.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// hello, in English
// hola, in Spanish
// good day, in English

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String language;
    String text;

    public Greeting() {}

    public Greeting(String language, String text) {
        this.language = language;
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public String getLanguage() {
        return this.language;
    }
}
