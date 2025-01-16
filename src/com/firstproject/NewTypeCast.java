package com.firstproject;

public class NewTypeCast {
    public static void main(String[] args){
        int tax = 13;
        double price= 100.02 + tax;  //type casting
        System.out.println(price);

        double newTax = 13.39;
        int newPrice = 100 + (int)newTax;   //explicit
        System.out.println(newPrice);

        final float pi= 3.14f;
        System.out.println(pi);
    }
}