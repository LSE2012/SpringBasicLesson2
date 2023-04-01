package edu.homework.lesson2;

public class RapMusic implements Music {

    private String genreMusic;
    private String author;
    private String nameSong;
    @Override
    public java.lang.String getSong() {
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
