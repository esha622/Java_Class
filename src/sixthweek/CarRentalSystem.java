package sixthweek;
//Car rental company requires customers to be at least 21 years old to rent a car
//take the user's age input, throws a custom exception of the age is below 21,
// handles the exception properly and displays an appropriate message

import java.util.Scanner;

class InsufficientAgeGroup extends Exception{
    public InsufficientAgeGroup(String message){
        super(message);
    }
}
public class CarRentalSystem {
    private static int ages;

    public static void agegroup(int age) throws InsufficientAgeGroup {
        if(age <= 21){
            throw new InsufficientAgeGroup("Below valid age group");
        }
        else{
            System.out.println("Valid age");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int ages = sc.nextInt();
        try{
            agegroup(ages);
        }
        catch (InsufficientAgeGroup e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
