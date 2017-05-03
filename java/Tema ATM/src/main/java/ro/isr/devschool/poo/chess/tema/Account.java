package ro.isr.devschool.poo.chess.tema;

import java.util.List;

public class Account {

    private int nrAcc;
    private int pinAcc;
    private int amount;

   public Account (int nrAcc, int pinAcc, int amount){
        this.nrAcc=nrAcc;
        this.pinAcc=pinAcc;
        this.amount=amount;
    }

    public int getNrAcc(){
        return this.nrAcc;
    }

    public int getPinAcc(){
        return this.pinAcc;
    }

    public int getAmount(){
        return this.amount;
    }



    public static Account getAccount(List<Account> accounts, int accountNumber) {
        return accounts.stream().filter(x -> x.getNrAcc() == accountNumber).findFirst().orElse(null);
    }

    public void addAmount(int val){
        this.amount+=val;
    }
    public void subAmount(int val){
        this.amount-=val;
    }




}
