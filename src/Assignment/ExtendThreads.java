package Assignment;

public class ExtendThreads extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ExtendMain thread = new ExtendMain();
        thread.start();
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}