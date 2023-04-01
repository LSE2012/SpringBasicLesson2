package edu.homework.lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.random.RandomGenerator;

public class TestSpringLesson2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        RockMusic classicMusic = context.getBean("musicBean", RockMusic.class);


        MyPlayer myPlayer = context.getBean("myPlayer", MyPlayer.class);

        int randomVolume = new Random().nextInt(0, 100);
        myPlayer.setVolume(randomVolume);
        System.out.println("===============================================");
        System.out.println("Player Settings. Volume= " + myPlayer.getVolume());
        System.out.println("Player Settings. Player Name=" + myPlayer.getName());
        System.out.println("===============================================");

//        myPlayer.setAuthor("Queen");
        myPlayer.playMusic();
        context.close();
    }
}
