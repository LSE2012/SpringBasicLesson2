package edu.homework.lesson2;

public class MyPlayer {
    private Music music;
    public  MyPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.printf("Playing song: " + music.getSong() );
    }

}
