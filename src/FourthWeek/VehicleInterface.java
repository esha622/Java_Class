package FourthWeek;

//Implement an interface Vehicle with methods start() and stop(). Create classes Car and Bike that implement this interface
interface Vehicles{
    public void Start();
    public void Stop();
}
class Car implements Vehicles{
    @Override
    public void Start() {
        System.out.println("Start the car engine");
    }

    @Override
    public void Stop() {
        System.out.println("Stop the car engine");
    }
}
class Bike implements Vehicles{
    @Override
    public void Start() {
        System.out.println("Start the bike engine");
    }

    @Override
    public void Stop() {
        System.out.println("Stop the bike engine");
    }
}

public class VehicleInterface {
    public static void main(String[] args) {
        Vehicles myCar = new Car();
        myCar.Start();
        myCar.Stop();

        Vehicles myBike = new Bike();
        myBike.Start();
        myBike.Stop();
    }
}
