package FourthWeek;

abstract class User{
    User(){
        System.out.println("User Constructor");
    }
    abstract void auth();
    public static void userDetail(){
        System.out.println("User Detail");
    }
}

class AdminUser extends User{
    AdminUser(){
        System.out.println("Admin user constructor");
    }
    /*@Override
    void auth(){
        System.out.println("Auth user");
    }*/
    @Override
    void auth(){
        System.out.println("User Authentication");
    }
}
interface Vehicle{
    public void run();
    //public static void horn(){  //static to print the certain defined things only where override doesn't works
      //  System.out.println("Horn On");
    //}
    public void horn();
}

interface ElectricVehicles{
    void battery();
}

class FourWheeler implements Vehicle, ElectricVehicles{
    @Override
    public void run() {
        System.out.println("Vehicle run");
    }

    @Override
    public void horn() {
        System.out.println("horn");
    }

    @Override
    public void battery() {
        System.out.println("Battery");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        AdminUser ad = new AdminUser();
        User.userDetail();
    }
}
