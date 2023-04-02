package edu.homework.lesson2;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MyPlayer {
    private Music music;
    private List<Music> listMusics;
    private String authorSong;
    @Value("${myPlayer.namePlayer}")
    private String namePlayer;
    @Value("${myPlayer.volumePlayer}")
    private int volumePlayer;
    private String status;


    public MyPlayer(Music music){
        this.music = music;
    }

    public MyPlayer(List<Music> listMusics) {
        this.listMusics = listMusics;
    }

    public String playMusic() {
        Random random = new Random();
        int i = random.nextInt(listMusics.size());
        music = listMusics.get(i);

        return "Playing music " +
                ">>>> Song= " + music.getSong() +
                ">>>> Genere = " + music.getGenre() +
                ">>>> Author song=" + music.getAuthorSong();
    }

//    public MyPlayer() {}

    private void doChangeStatusPlayer() {
        this.status = "statusStartPlaying";
        System.out.println("Init Bean myPlayer. Status player: " + status);
    }


    private void doClothePlayer() {
        this.status ="statusClosePlaying";
        System.out.println("Destroy Bean . Status player: " + status);
    }


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
