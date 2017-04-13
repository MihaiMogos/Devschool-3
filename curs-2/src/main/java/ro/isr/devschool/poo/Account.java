package ro.isr.devschool.poo;

/**
 * Created by crist on 16-Mar-17.
 */
public class Account<N, P, B> {
    private N number;
    private P pin;
    private B balance;
    public Account(N number, P pin, B balance){
        this.number = number;
        this.pin = pin;
        this.balance = balance;
    }
    public N getNumber(){ return number; }
    public P getPin(){ return pin; }
    public B getBalance() {
        return balance;
    }

    public void setBalance(B balance) {
        this.balance = (B)balance;
    }
}
