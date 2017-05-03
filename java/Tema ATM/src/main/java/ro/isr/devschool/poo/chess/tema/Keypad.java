package ro.isr.devschool.poo.chess.tema;


import java.util.Scanner;

public class Keypad {


    private int data;

    public Keypad(String msg){

        System.out.println(msg);
        Scanner scData = new Scanner(System.in);
        this.data = scData.nextInt();



    }

    public int getData(){
        return this.data;
    }
}
