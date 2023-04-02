package edu.homework.lesson2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicMusic implements Music {
    private String genreMusic;
    private String author;
    private String nameSong;

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init Bean ClassicMusic!");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy Been ClassicMusic!");
    }

    @Override
    public String getSong() {
        this.nameSong =  "Симфонія Бетховена №5";
        return nameSong ;
    }

    @Override
    public String getGenre() {
        this.genreMusic = "genre: ClassicMusic";
        return genreMusic;
    }

    @Override
    public String getAuthorSong() {
        this.author = "Бетховен";
        return this.author;
    }

}
