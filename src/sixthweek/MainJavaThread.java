package sixthweek;

public class MainJavaThread implements Runnable{
    @Override
    public void run(){
        for (int i= 1; i<=10; i++){
            System.out.println("First New Thread: " + i);
        }
        try{
        Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
