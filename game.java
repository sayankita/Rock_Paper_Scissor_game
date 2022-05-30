package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWH_rock_paper_scissor{
    public static void main(String[] args) {
        System.out.println("->0 mean stone.\n->1 mean scissor.\n->2 mean paper.\n");
        System.out.println("SELECT ANY NUMBER OF YOUR CHOICE \n");
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int c;
        int c1=0;
        int u1=0;
        int i=1;
        while(i<=5){
            System.out.println("ROUND "+i);
            System.out.println("YOUR CHANCE!");
            int u=sc.nextInt();
            System.out.println("COMPUTER'S CHANCE!");
            c=ran.nextInt(3);
            System.out.println(c);
            System.out.println("   ");
            switch (c){
                case 0:
                    switch (u) {
                        case 0 -> System.out.println("This match is TIE!");
                        case 1 -> {
                            System.out.println("Computer WON this round.");
                            c1++;
                        }
                        case 2 -> {
                            System.out.println("Congrats! You WON this round.");
                            u1++;
                        }
                        default -> {
                            System.out.println("You are not entered a valid number try again");
                            i--;
                        }
                    }
                    break;
                case 1:
                    switch (u) {
                        case 0 -> {
                            System.out.println("Congrats! You WON this round.");
                            u1++;
                        }
                        case 1 -> System.out.println("This match is TIE!");
                        case 2 -> {
                            System.out.println("Computer WON this round.");
                            c1++;
                        }
                        default -> {
                            System.out.println("You are not entered a valid number try again");
                            i--;
                        }
                    }
                    break;
                case 2:
                    switch (u) {
                        case 0 -> {
                            System.out.println("Computer WON this round.");
                            c1++;
                        }
                        case 1 -> {
                            System.out.println("Congrats! You WON this round.");
                            u1++;
                        }
                        case 2 -> System.out.println("This match is TIE!");
                        default -> {
                            System.out.println("You are not entered a valid number try again");
                            i--;
                        }
                    }
                    break;
            }
            i++;
            System.out.println("\n\n\n");
        }
        System.out.printf("\nYou won %d round.\nComputer won %d round.", u1 , c1);
        if(c1<u1){
            System.out.println("\nYou are a WINNER of this game");
        }
        else if(c1>u1){
            System.out.println("\nComputer is a WINNER of this game");
        }
        else if(c1==u1){
            System.out.println("\nThis game is TIE");
        }
    }
}
