package edu.homework.lesson2;


public class Computer {

    private int id;
    private MyPlayer myPlayer;


    public Computer(MyPlayer myPlayer) {
        this.id = 0 ;
        this.myPlayer = myPlayer;
    }

    @Override
    public String toString() {
        System.out.println("===============================================");
        System.out.println("Player Settings. Volume= " + myPlayer.getVolume());
        System.out.println("Player Settings. Player Name=" + myPlayer.getName());

        return "Computer{ id=" + id +", myPlayer Settings{" +
        " ----> myPlayer.Name= " + myPlayer.getName() +
        " ----> myPlayer.Volume=" + myPlayer.getVolume();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
