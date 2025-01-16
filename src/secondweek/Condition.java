package secondweek;

import java.util.Scanner;
public class Condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling Price: ");
        int price = sc.nextInt();

        if(price >= 1000){
            double discount = price * 30/100;
            System.out.println(discount);
            double newprice = price -discount;
            System.out.println(newprice);
        }
        else if(price >= 400 && price < 1000){
            double discount = price * 20/100;
            System.out.println(discount);
            double newprice = price -discount;
            System.out.println(newprice);
        }
        else if(price >= 200 && price < 400){
            double discount = price * 10/100;
            System.out.println(discount);
            double newprice = price -discount;
            System.out.println(newprice);
        }
        else{
            System.out.println("No discount");
        }

        /*if(percentage >= 90 && percentage <= 100){
            System.out.println("A");
        }
        else if(percentage >=80 && percentage <= 90){
            System.out.println("B");
        }
        else if(percentage >=70 && percentage <= 80){
            System.out.println("C");
        }
        else if(percentage >=60 && percentage <= 70){
            System.out.println("D");
        }
        else if(percentage >=0 && percentage <= 60){
            System.out.println("Fail");
        }
        else{
            System.out.println("The percentage cross the limits");
        }*/
    }
}
