package secondweek;

import java.util.Scanner;

public class JavaCondition {
    public static void main(String[] args){
        //check given number odd or even
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Even");
        }

        else{
            System.out.println("Odd");
        }

        if(num == 1){
            System.out.println("Sunday");
        }
        else if(num == 2){
            System.out.println("Monday");
        }
        else if(num == 3){
            System.out.println("Tuesday");
        }
        else if(num == 4){
            System.out.println("Wednesday");
        }
        else if(num == 5){
            System.out.println("Thursday");
        }
        else if(num == 6){
            System.out.println("Friday");
        }
        else if(num == 7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("There are only 7 days a week");
        }*/

        //write a code to check the given user credential is valid or not
        //given by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your usename: ");
        String username = sc.nextLine();
        String password = "123";

        //stored credential
        String storedUsername = "test@female.com";
        String storedPwd = "858563";

        if (username == storedUsername && password==storedPwd){
            System.out.println("Vaild");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
