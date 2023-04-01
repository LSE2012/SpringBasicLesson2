package edu.homework.lesson2;

public class RockMusic implements Music {
    private String genreMusic;
    private String author;
    private String nameSong;
    private RockMusic() {}

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    public void doMyInit() {
        System.out.println("Init Bean RockMusic!");
    }

    public void doMyDestroy() {
        System.out.println("Destroy Been RockMusic!");
    }

    @Override
    public java.lang.String getSong() {
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
