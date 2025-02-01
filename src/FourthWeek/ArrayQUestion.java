package FourthWeek;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayQUestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> grocery = new ArrayList<>();

        while(true){
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View item");
            System.out.println("4. Exit");
            System.out.println("Choose an option..");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Enter item: ");
                    String item = sc.nextLine();
                    grocery.add(item);
                    if(grocery.contains(item)){
                        System.out.println("Item already exist");
                    }
                    else{
                        grocery.add(item);
                        System.out.println("New added item is: " + item);
                    }
                    break;
                case 2:
                    System.out.println("Enter item to remove: ");
                    String itemToRemove = sc.nextLine();
                    if (grocery.remove(itemToRemove)) {
                        System.out.println("Removed item: " + itemToRemove);
                    }
                    else {
                        System.out.println("Item not found: " + itemToRemove);
                    }
                    break;
                case 3:
                    System.out.println(grocery);
                    break;
                case 4:
                    System.out.println("Program exiting");
                    break;
                default:
                    System.out.println("wrong option");
            }
        }
    }
}
