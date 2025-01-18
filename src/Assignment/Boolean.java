package Assignment;

public class Boolean {
    public static void main(String[] args) {
        boolean isMomodelicious = true;
        boolean isPizzaHealthy = false;
        System.out.println(isMomodelicious);     //Outputs true
        System.out.println(isPizzaHealthy);      //Outputs false

        int x= 85;
        int y= 63;
        System.out.println(x > y);        //Output true
        System.out.println(x == 40);      //Output false

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);   //Output true
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
