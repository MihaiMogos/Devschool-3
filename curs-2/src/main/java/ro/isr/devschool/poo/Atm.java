package ro.isr.devschool.poo;

import java.util.List;

/**
 * Created by crist on 16-Mar-17.
 */
public class Atm {
    public static void main(String[] args) {
        BankDatabase bankDatabase = new BankDatabase();
        bankDatabase.addAccounts();
        List<Account<Integer, Integer, Integer>> accounts = bankDatabase.getAccounts();
        Withdrawal withdrawal =  new Withdrawal();
        Deposit deposit = new Deposit();
        Balance balance = new Balance();
        Screen screen = new Screen();

        while(true) {
            boolean flag = false;
            Account account = new Account(0, 0, 0);
            while (!flag) {
                screen.showWelcome();
                int accountNumber = Keypad.getInteger();
                screen.showInsertPin();
                int accountPin = Keypad.getInteger();
                account = new Account(accountNumber, accountPin, 0);

                for (Account pair : accounts) {
                    if (pair.getNumber().equals(account.getNumber()) && pair.getPin().equals(account.getPin())) {
                        screen.showMessage("Account ok!");
                        account.setBalance(pair.getBalance());
                        flag = true;
                        break;
                    }
                }
            }
            flag = false;
            while (!flag) {
                screen.showActions();
                int action = Keypad.getInteger();
                switch (action) {
                    case 1:
                        screen.showBalance(balance.getBalance(account));
                        break;
                    case 2:
                        screen.showDepositScreen();
                        deposit.setDeposit(account, Keypad.getInteger());
                        break;
                    case 3:
                        screen.showWithdrawalAmounts();
                        int amount = Keypad.getInteger();
                        int success = 1;
                        switch (amount){
                            case 1:
                                success = withdrawal.performWithdrawal(account, 20);
                                break;
                            case 2:
                                success = withdrawal.performWithdrawal(account, 40);
                                break;
                            case 3:
                                success = withdrawal.performWithdrawal(account, 60);
                                break;
                            case 4:
                                success = withdrawal.performWithdrawal(account, 100);
                                break;
                            case 5:
                                success = withdrawal.performWithdrawal(account, 200);
                                break;
                            default:
                                break;
                        }
                        if(success == 2){
                            screen.showMessage("Not enough money in ATM!");
                        }
                        break;
                    case 4:
                        flag = true;
                        break;
                    default:
                        screen.showMessage("This action does not exist!");
                        break;
                }
            }
            screen.showMessage("Thank you for using this ATM!");
        }
    }
}