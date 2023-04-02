package edu.homework.lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;


public class TestSpringLesson2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

         MyPlayer myPlayer = context.getBean("myPlayer", MyPlayer.class);

        int randomVolume = new Random().nextInt(0, 100);
        myPlayer.setVolume(randomVolume);
        myPlayer.setName("Spotify");
        System.out.println("===============================================");
        System.out.println("Player Settings. Volume= " + myPlayer.getVolume());
        System.out.println("Player Settings. Player Name=" + myPlayer.getName());
        System.out.println("===============================================");

        Computer computer = context.getBean("computer", Computer.class);
        Computer computer2 = context.getBean("computer", Computer.class);
        Computer computer3 = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }
}
