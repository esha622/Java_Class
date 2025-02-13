package sixthweek;

public class ExceptionJava {
    public static void voterAgeCheck(int age){
        if(age > 20){
            throw new IllegalArgumentException("Invaild age");
        }
        System.out.println("Allowed age to vote");
    }
    public static void divideResult(int divideValue, int divideBy) throws ArithmeticException{ //throws declared the except which can be occurred in this block of code
        int res = divideValue / divideBy;
        System.out.println("Result= " + res);
    }
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5};
        try{
            divideResult(4, 0);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
