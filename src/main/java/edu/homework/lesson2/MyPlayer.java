package edu.homework.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component()
public class MyPlayer {

    private Music music;
    private String authorSong;
    @Value("${myPlayer.name}")
    private String name;
    @Value("${myPlayer.volume}")
    private int volume;
    private String status;

    @Autowired
    public MyPlayer(@Qualifier("classicMusic") Music music){
        this.music = music;
    }

    public String playMusic() {
        System.out.println("Playing music: " + music.getSong());
        return "Playing: music " +
                ">>>> Song= " + music.getSong() +
                ">>>> Genere = " + music.getGenre() +
                ">>>> Author song=" + music.getAuthorSong();
    }

    public MyPlayer() {}


    @PostConstruct
    private void doChangeStatusPlayer() {
        this.status = "statusStartPlaying";
        System.out.println("Init Bean myPlayer. Status player: " + status);
    }

    @PreDestroy
    private void doClothePlayer() {
        this.status ="statusClosePlaying";
        System.out.println("Destroy Bean . Status player: " + status);
    }


//    public void setAuthor(String authorSong) {
//         this.authorSong = authorSong;
//    }
//
//    public void playMusic() {
//        System.out.println("-------------------------------");
//        System.out.println("Genre music:" +  music.getGenre());
//        System.out.println("Playing song: " + music.getSong());
//        System.out.println("AuthorSong = "  + music.getAuthorSong());
//        System.out.println("-------------------------------");
//    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }
//
    public void setVolume(int volume) {
        this.volume = volume;
    }

}
