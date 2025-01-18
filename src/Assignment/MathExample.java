package Assignment;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(Math.max(15, 12));   //Output 15
        System.out.println(Math.min(15, 12));   //Output 12
        System.out.println(Math.sqrt(81));   //Output 9.0
        System.out.println(Math.abs(-8.5));   //Output 8.5
        System.out.println(Math.random());   //Returns random number between 0.0 and 1.0

        int randomNum = (int)(Math.random() * 101);   //Formula for random number between 0 to 100
        System.out.println(randomNum);
    }
}
