package FifthWeek;

import java.util.Scanner;
//Check if the entered amount is a multiple of $100
//Ensure the user's balance is sufficient before withdrawal
//Deduct the amount if valid and show the remaining balance

public class BankATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int balance = sc.nextInt();
        if(balance == 100){
            System.out.println("Enough balance");
            int result = balance - 1000;
        }
        else{
            System.out.println("Not enough balance");
        }
    }
}
