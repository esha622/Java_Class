package secondweek;

import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int multiple = 1;

        while(multiple <= 10){
            int result =  multiple * number;
            System.out.println(result);
            multiple++;
        }
        /*int num = 1;
        while (num <=100){
            System.out.println(num);
            num++;
        }
        //from 100 to 1
        int next_num = 100;
        while(next_num>=1){
            System.out.println(next_num);
            next_num--;
        }
        int sum = 0;
        int numm = 1;
        while (numm <=10){
            sum += numm;
            numm++;
        }
        System.out.println(sum);
        //Reserve
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int numb = sc.nextInt();
        int totalSum = 0;

        while (numb !=0){
            int digit = numb % 10;
            totalSum += digit;
            numb /= 10;
        }
        System.out.println(totalSum);*/
/*
        int validPwd = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a your password: ");
        int password = sc.nextInt();

        while (password != validPwd){
            System.out.println("Invalid password (Try again): ");
            password = sc.nextInt();
        }
        System.out.println("Valid password");
        sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int multiple = 1;

        while(multiple <= 10){
            int result =  multiple * number;
            System.out.println(result);
            multiple++;
        }*/
        /*int num = 4;

        do{
            System.out.println(num);
        }
        while(num <3);{

        }
        int i = 2;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);{

        }*/
    }
}
