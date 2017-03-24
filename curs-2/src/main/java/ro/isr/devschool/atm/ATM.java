package ro.isr.devschool.atm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.isr.devschool.atm.Transactions.BalanceInquiry;
import ro.isr.devschool.atm.Transactions.Deposit;
import ro.isr.devschool.atm.Transactions.Withdrawal;

import java.util.ArrayList;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ATM {

    private BankDatabase bankDatabase;
    private CashDispenser cashDispenser;

    private Screen screen = new Screen();
    private Keypad keypad = new Keypad();


    public void execute() {

        Account first = new Account(1, 1, 1200);
        Account second = new Account(2, 2, 1000);
        Account third = new Account(3, 3, 50);
        Account fourth = new Account(4, 4, 200);
        Account fifth = new Account(5, 5, 250);

        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.add(first);
        accounts.add(second);
        accounts.add(third);
        accounts.add(fourth);
        accounts.add(fifth);

        this.bankDatabase = new BankDatabase("ING", accounts);
        this.cashDispenser = new CashDispenser(200);


        boolean logged;
        boolean flag = true;

        while (flag) {
            screen.welcome();
            screen.enterAccNr();
            int accNr = keypad.getKey();
            screen.enterPin();
            int pin = keypad.getKey();

            int index = bankDatabase.findUser(accNr, pin);
            if (index == -1) {
                screen.invalidLogin();
            } else {
                logged = true;
                while (logged) {
                    screen.showActions();
                    int action = keypad.getKey();

                    switch (action) {
                        case 1:
                            new BalanceInquiry(bankDatabase, screen, index).execute();
                            break;
                        case 2:
                            new Deposit(bankDatabase, screen, index, keypad).execute();
                            break;
                        case 3:
                            screen.withdrawActions();
                            new Withdrawal(bankDatabase, screen, index, keypad, cashDispenser).execute();
                            break;
                        case 4:
                            logged = false;
                            flag = false;
                            break;

                    }
                }
            }
        }

    }


}
