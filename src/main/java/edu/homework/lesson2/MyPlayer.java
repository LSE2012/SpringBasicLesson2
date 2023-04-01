package edu.homework.lesson2;

public class MyPlayer {
    private Music string;
    private String authorSong;
    private String name;
    private int volume;
    private String status;

    public MyPlayer() {}

    public  MyPlayer(Music string) {
        this.string = string;
    }

    private void doChangeStatusPlayer() {
        this.status = "statusStartPlaying";
        System.out.println("Init Bean myPlayer. Status player: " + status);
    }

    private void doClothePlayer() {
        this.status ="statusClosePlaying";
        System.out.println("Init Bean myPlayer. Status player: " + status);
        System.out.println("Destroy Bean . Status player: " + status);
    }

    public void setAuthor(java.lang.String authorSong) {
         this.authorSong = authorSong;
    }

    public void playMusic() {
        System.out.println("-------------------------------");
        System.out.println("Genre music:" + string.getGenre());
        System.out.println("Playing song: " + string.getSong());
        System.out.println("AuthorSong = "  + string.getAuthorSong());
        System.out.println("-------------------------------");
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
