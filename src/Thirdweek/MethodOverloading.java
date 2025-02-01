package Thirdweek;

//method overloading means having the same method name and can be used having different parameters like int with double or int with int
//Recursion is the technique of making a function call itself

public class MethodOverloading {
    static void sum(int a, int b){

    }
    static void sum(int a, double b){

    }
    //first passes 10
    //then passes 10  + 9 + sum(8)
    static int sum(int number){
        // sum of 1 to 10
        if(number > 0){
            return number + sum(number - 1);
        }
        else{
            return 0;
        }
    }
    static int calcfactorial(int number){
        if(number == 1 || number==0){
            return 1;
        }
        else{
            return number * calcfactorial(number - 1);
        }
    }
    public static void main(String[] args) {
        int num = sum(5);
        int numb = calcfactorial(5);
        System.out.println(("Sum= ")+ num);
        System.out.println("Factorial= " + numb);
    }
}
