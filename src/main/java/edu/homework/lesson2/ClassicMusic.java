package edu.homework.lesson2;

public class ClassicMusic implements Music {
    private String genreMusic;
    private String author;
    private String nameSong;

    @Override
    public java.lang.String getSong() {
        this.nameSong =  "Симфонія Бетховена №5";
        return nameSong ;
    }

    @Override
    public String getGenre() {
        this.genreMusic = "genre: ClassicMusic";
        return genreMusic;
    }

    @Override
    public java.lang.String getAuthorSong() {
        this.author = "Бетховен";
        return this.author;
    }

}
