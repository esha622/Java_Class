package sixthweek;

public class NewSyncThread {
    private int amount = 1000;

    public synchronized void calculate(int value){
        amount -= value;
        System.out.println("New amount: " + amount);
    }
}
