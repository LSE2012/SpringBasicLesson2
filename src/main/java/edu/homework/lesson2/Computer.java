package edu.homework.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MyPlayer myPlayer;

    @Autowired
    public Computer(MyPlayer myPlayer) {
        this.id = 1 ;
        this.myPlayer = myPlayer;
    }

    @Override
    public String toString() {
        return "Computer{ id=" + id +", myPlayer Settings{" +
        " ----> myPlayer.Name= " + myPlayer.getName() +
        " ----> myPlayer.Volume=" + myPlayer.getVolume() ;
    }
}
