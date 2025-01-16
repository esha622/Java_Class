package com.firstproject;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Age:" + age);*/

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        //String name = sc.next(); only prints first given word
        String name = sc.nextLine(); //prints in next line
        System.out.println(name);

    }
}
