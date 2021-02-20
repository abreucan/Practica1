package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Welcome*/
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce your first name in the following line");
        String firstn = input.next();
        System.out.print("Introduce your last name in the following line");
        String lastn = input.next();
        System.out.println();
        System.out.println("Hello, " + firstn + " " + lastn+"\nWelcome to the ADDING calculator");

        /*Adding program*/
        System.out.println("Introduce the first number");
        int fnumber = input.nextInt();
        System.out.println("Introduce your second number");
        int snumber = input.nextInt();

        int result = fnumber + snumber;

        System.out.print(firstn+", your result is: "+result+"\n");
    }
}


