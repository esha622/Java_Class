package com.firstproject;

public class JavaString {

    public static void main(String[] args){
        String fName = "Sohee";
        String lName = "Lee";
        String fullname = fName + " " + lName;
        System.out.println(fullname.length());
        System.out.println("Full Name: " + fullname);
        System.out.println(fName.charAt(0));
        System.out.println(fName.replace('e','E'));
        System.out.println(lName.substring(0,2));

    }
}
