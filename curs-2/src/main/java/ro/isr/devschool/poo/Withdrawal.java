package ro.isr.devschool.poo;

/**
 * Created by crist on 16-Mar-17.
 */
public class Withdrawal {
    private CashDispenser cashDispenser = new CashDispenser();
    public int performWithdrawal(Account account, int amount){
        if((int)account.getBalance() >= amount){
            account.setBalance((int)account.getBalance() - amount);
            if(cashDispenser.updateAfterWithdrawal(amount)){
                return 1;
            }
            else return 2;
        }
        else {
            System.out.println("Not enought money in your Account");
            return 0;
        }
    }
}
