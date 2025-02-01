package Thirdweek;

public class MethodJava {
    static void calcArea(double length, double breath){
        System.out.println(length * breath);
    }

    static int maxminCalculation(int[] arr, String type){
        int min= arr[0];
        int max = 0;
        for(int value: arr){
            if(value < min){
                min = value;
            }
            if(value > max){
                max = value;
            }
        }
        if(type == "min"){
            return min;
        }
        else{
            return max;
        }
    }
    static void arraySum(){
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {
        /*calcArea(1.0, 2.0);
        calcArea(3.0, 4.7);*/
        /*double result = calcArea(1.0, 2.0);
        System.out.println("Result = " + result);
        calcArea(3.0, 4.7);*/
        int[] arr= {5, 12, 3, 19, 8, 2};
        int result = maxminCalculation(arr, "min");
        int max = maxminCalculation(arr, "max");
        System.out.println("Result= " + result);
        System.out.println("Result= " + max);
    }
}
