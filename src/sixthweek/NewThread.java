package sixthweek;

public class NewThread {
    public static void main(String[] args) {
        /*Thread t3 = new Thread(new MainJavaThread());
        SecondNewThread t4 = new SecondNewThread();
        t4.start();
        t3.start();*/
        NewSyncThread nt = new NewSyncThread();
        Thread t5 = new Thread(() ->nt.calculate(600));
        Thread t6 = new Thread(() ->nt.calculate(200));
        t5.start();
        t6.start();
    }
}
