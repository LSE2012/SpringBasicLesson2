package edu.homework.lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MyPlayer myPlayer = context.getBean("myPlayer", MyPlayer.class);
        myPlayer.playMusic();

        context.close();
    }
}
