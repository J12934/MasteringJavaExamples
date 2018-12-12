import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    private List<String> transactions = new CopyOnWriteArrayList<>();
    private AtomicInteger balance = new AtomicInteger(0);

    public void deposit(int amount){
        if (amount >= 0) {
            balance.getAndAdd(amount);
            transactions.add("Deposited "+amount);
        }
    }

    public boolean withdraw (int amount){
        if (amount >= 0){
            if (balance >= amount){
                balance.getAndAdd(-amount);
                transactions.add("Withdraw "+amount);
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println("Type in a number between 0 and 10000:");


        System.out.println("");
        //join all threads
        //Counter with count of three
        //
    }
}
