package edu.homework.lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;


public class TestSpringLesson2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MyPlayer myPlayer = context.getBean("myPlayer", MyPlayer.class);
        Computer computer = context.getBean("computer", Computer.class);

        int randomVolume = new Random().nextInt(0, 100);
        myPlayer.setVolume(randomVolume);
        myPlayer.setName("Spotify");

        computer.toString();
        System.out.println(myPlayer.playMusic());

        context.close();
    }
}
