package FifthWeek;

import java.util.Scanner;
class Seats {
    static String checkAvailabilities(String[] bookSeats, String dateToCheck) {
        for (String bookSeat : bookSeats) {
            if (bookSeat.equals(dateToCheck)) {
                return "Seat is not available";
            }
        }
        return "Seat is available";
    }
}
public class Questions {
    public static void main(String[] args){
        /*int[] listt = {1, 2, 3};
        int max = 2;

        for(int i=0; i<listt.length; i++){
            if(listt[i] > max) {
                max = listt[i];
            }
        }
        System.out.println("Greatest number: "+ max);
        int min = 5;

        for(int i=0; i<listt.length; i++){
            if(listt[i] < min) {
                min = listt[i];
            }
        }
        System.out.println("Smallest number: " + min);*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        for(int i=1; i>=number; i++){
            int result= i*number;
            System.out.println(result);
        }*/
        String[] bookedDates = {"1", "2", "3", "4"};
        //String[] seatss = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a seat number: ");
        String dateToCheck = sc.next();

        String availabilityMessage = Seats.checkAvailabilities(bookedDates, dateToCheck);
        System.out.println(availabilityMessage);

        sc.close();
    }
}
