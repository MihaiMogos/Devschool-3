package ro.isr.devschool.poo;

/**
 * Created by crist on 16-Mar-17.
 */
public class Deposit {
    public void setDeposit(Account account, int amount){
        account.setBalance((int)account.getBalance() + amount);
    }
}
