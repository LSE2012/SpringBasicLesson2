package edu.homework.lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;


public class TestSpringLesson2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MyPlayer myPlayer = context.getBean("myPlayer", MyPlayer.class);
        ClassicMusic classicMusic = context.getBean("classicMusic",ClassicMusic.class );
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);

        int randomVolume = new Random().nextInt(0, 100);
        myPlayer.setVolume(randomVolume);
        myPlayer.setName("Spotify");


        Computer computer = context.getBean("computer", Computer.class);
        computer.setId(1);
        System.out.println(computer);
        System.out.println(myPlayer.playMusic());

        Computer computer2 = context.getBean("computer", Computer.class);
        computer2.setId(2);
        myPlayer.setVolume(55);
        System.out.println(computer2);
        Computer computer3 = context.getBean("computer", Computer.class);
        computer3.setId(3);
        myPlayer.setVolume(75);
        System.out.println(computer3);

        context.close();
    }
}
