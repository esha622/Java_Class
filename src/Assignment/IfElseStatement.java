package Assignment;

public class IfElseStatement {
    public static void main(String[] args) {
     int x = 60;
     int y = 63;
     if(x > y){
         System.out.println("x is greater than y");
     }
     else{
         System.out.println("No, y is greater than x");
     }

     int time = 22;
     if (time < 10){
         System.out.println("Good Morning");
     }
     else if(time < 18){
         System.out.println("Good Day");
        }
     else{
         System.out.println("Good Evening");
     }
    }
}
