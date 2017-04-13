package ro.isr.devschool.poo;

/**
 * Created by crist on 16-Mar-17.
 */
public class CashDispenser {
    private int totalMoney = 500;

    public boolean updateAfterWithdrawal(int amount){
        if(totalMoney >= amount ) {
            totalMoney -= amount;
            return true;
        }
        else{
            return false;
        }
    }
}
