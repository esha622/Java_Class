package secondweek;

import java.util.Scanner;
public class OperatorSwitch {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a operator: ");
        String operator = sca.next();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1 = sc.nextInt();
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter a second number: ");
        int num2 = scc.nextInt();

        switch(operator){
            case "*":
                System.out.println("Result = "+ (num1 * num2));
                break;
            case "/":
                System.out.println("Result = "+ (num1 / num2));
                break;
            case "+":
                System.out.println("Result = "+ (num1 + num2));
                break;
            case "-":
                System.out.println("Result = " + (num1 - num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
