package edu.homework.lesson2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RockMusic implements Music {
    private String genreMusic;
    private String author;
    private String nameSong;
    private RockMusic() {}

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init Bean RockMusic!");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy Been RockMusic!");
    }

    @Override
    public String getSong() {
        this.nameSong = "We Are the Champions";
        return nameSong ;
    }

    @Override
    public String getGenre() {
        this.genreMusic = "genre: Rock Music";
        return genreMusic;
    }

    @Override
    public String getAuthorSong() {
        this.author = "Queen";
        return this.author;
    }
}
