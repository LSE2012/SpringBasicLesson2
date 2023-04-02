package edu.homework.lesson2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RapMusic implements Music {

    private String genreMusic;
    private String author;
    private String nameSong;

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init Bean RapMusic!");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy Been RapMusic!");
    }


    @Override
    public String getSong() {
        this.nameSong = "The Real Slim Shady.";
        return nameSong ;
    }

    @Override
    public String getGenre() {
        this.genreMusic = "genre: Rap Music";
        return genreMusic;
    }

    @Override
    public String getAuthorSong() {
        this.author = "Eminem";
        return this.author;
    }
}
