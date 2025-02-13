package sixthweek;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class Bank {
    private static int balance = 300000;

    public static void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else{
            balance -= amount;
            System.out.println("Sucessful. Your current amount: " + balance);
        }
    }

    public static void main(String[] args) {
        try{
            withdraw(500000);
        }
        catch (InsufficientBalanceException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
