package secondweek;

import java.util.Scanner;
public class SwitchCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a traffic light signal: ");
        String signal = sc.next();

        switch (signal){
            case "red":
            case "Red":
                System.out.println("Stop");
                break;
            case "yellow":
            case "Yellow":
                System.out.println("Slow down");
                break;
            case "green":
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid signal");
        }


        /*System.out.println("Enter the HTTP status: ");
        int HTTP = sc.nextInt();

        switch (HTTP){
            case 200:
                System.out.println("Ok");
                break;
            case 400:
                System.out.println("Not Found");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            default:
                System.out.println("Unknown status");
        }*/
    }
}
