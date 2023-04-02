package edu.homework.lesson2;

import org.springframework.beans.factory.annotation.Value;

public class MyPlayer {

    private Music music;
    private String authorSong;
    @Value("${myPlayer.namePlayer}")
    private String namePlayer;
    @Value("${myPlayer.volumePlayer}")
    private int volumePlayer;
    private String status;


    public MyPlayer(Music music){
        this.music = music;
    }

    public String playMusic() {
        return "Playing music " +
                ">>>> Song= " + music.getSong() +
                ">>>> Genere = " + music.getGenre() +
                ">>>> Author song=" + music.getAuthorSong();
    }

    public MyPlayer() {}



    private void doChangeStatusPlayer() {
        this.status = "statusStartPlaying";
        System.out.println("Init Bean myPlayer. Status player: " + status);
    }


    private void doClothePlayer() {
        this.status ="statusClosePlaying";
        System.out.println("Destroy Bean . Status player: " + status);
    }


//    public void setAuthor(String authorSong) {
//         this.authorSong = authorSong;
//    }
//
    public String getName() {
        return namePlayer;
    }

    public void setName(String name) {
        this.namePlayer = name;
    }

    public int getVolume() {
        return volumePlayer;
    }
//
    public void setVolume(int volume) {
        this.volumePlayer = volume;
    }

}
