package secondweek;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        /*int num = 5;
        for(int i=1; i<=10; i++){
            System.out.println("Result= "+ num * i);
        }

//Prime numbers:
        /*int num = 3;
        boolean isPrime = true;
        if(num < 2){
            isPrime = false;
        }
        else{
            for(int i=2; i<=num; i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
        }
        if(isPrime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }*/

        //reversing string
        /*String words = "JavaProgramming";
        String reverse = "";
        for(int i= words.length() - 1; i>=0; i--){
            reverse += words.charAt(i);
        }
        System.out.println(reverse);*/

        //right-angle triangle
        /*for(int i=1; i<=5; i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        /*int [] newNumbers = {5, 12, 3, 19, 8, 2};
        int max = 5;

        for(int i=0; i<newNumbers.length; i++){
            if(newNumbers[i] > max) {
                max = newNumbers[i];
            }
        }
        System.out.println(max);
        int min = 5;

        for(int i=0; i<newNumbers.length; i++){
            if(newNumbers[i] < min) {
                min = newNumbers[i];
            }
        }
        System.out.println(min);*/

        /*int[] arraynum = {1, 2, 3, 2, 4, 2, 5};
        int targetnum = 2;
        int count = 0;
        for(int i=0; i< arraynum.length; i++){
            if(arraynum[i] == targetnum){
                count++;
            }
        }
        System.out.println(count);*/
    }
}
