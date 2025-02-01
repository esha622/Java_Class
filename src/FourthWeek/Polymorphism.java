package FourthWeek;

class VehicleNew{
    String regNo;
    String model;

    public void run(){
        System.out.println("run");
    }
}

class TwoWheeler extends VehicleNew{
    @Override
    public void run(){
        System.out.println("2 wheeler run");
    }
}
class Library{
    private String bookName;
    private String libraryName;

    public void setBookName(String bookName){
        this.bookName = bookName;
    }
}

public class Polymorphism {
    //Compile-time Method overloading
    public void sum(int a, int b){
        System.out.println("Sum =" + (a+b));
    }
    public void sum(int a, int b, int c){
        System.out.println("Sum =" + (a+b+c));
    }
    public void sum(int a, double b){
        System.out.println("Sum =" + (a+b));
    }
    public static void main(String[] args) {
        TwoWheeler tw= new TwoWheeler();
        tw.run();
    }
}