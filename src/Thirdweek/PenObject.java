package Thirdweek;

class Pen{
    String color;
    String type;
    String size;

    public void printwrite(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.size);
    }
}

class Vehicle{
    String car;
    String bus;
    String truck;

    public void printvehicle(){
        System.out.println(this.car);
        System.out.println(this.bus);
        System.out.println(this.truck);
    }

}

public class PenObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Black";
        p1.size = "Long";
        p1.type = "Gel";

        p1.printwrite();
    }
}

