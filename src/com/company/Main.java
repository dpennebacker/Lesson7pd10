package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Not tested on the AP Exam
        //Step 1 Create the scanner
        Scanner kb = new Scanner(System.in);
        //Step 2 - Ask your user
        System.out.println("Enter fav. int");
        //Step 3 Record input
        int i = kb.nextInt();
        //test
        System.out.println("Your fav. int is " + i);

        //Step 2 , Step 3
        System.out.println("Enter your fav. double");
        double d = kb.nextDouble();
        System.out.println("Your fav. double is " +d);
        Scanner kbString = new Scanner(System.in);
        System.out.println("Enter fav. color");
        String color = kbString.nextLine();
        System.out.println("Fav color is " + color);
        //WTJ

    }
}
