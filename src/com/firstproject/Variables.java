package com.firstproject;

public class Variables {
    public static void main(String[] args){
        String fname = "Isha";
        String lname = "Sunuwar";
        System.out.println(fname + " " + lname);

        //final int myNum = 17;
        int myNum= 21;
        System.out.println(myNum);

        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);

        //Variables containing student data
        String studentName = "Isha Sunuwar";
        int studentID = 17;
        int studentAge = 20;
        float studentFee = 50.56f;
        char studentGrade = 'A';

        //Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        //integer variables
        int length = 4;
        int width = 6;
        int area;

        //Area of rectangle
        area = length * width;

        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}

