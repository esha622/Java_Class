package sixthweek;

//exception handling
//try- code to use
//catch() : things which needs to be exceptional

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            //int result = 18/0;
            String[] names = {"sohee", "anton", "wonbin"};
            System.out.println("First value= " + names[0]);
            System.out.println(names[3]);
        } catch (Exception e) {  //shortcut to show exception: exceptional only take first exception mentioned
            System.out.println("Exception: " + e.getMessage());;
        }
        /*catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exceptional occurred: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }*/
        finally {
            System.out.println("Finally code executed");
        }
        System.out.println("Program executed");
    }
}
