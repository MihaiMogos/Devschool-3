/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class ATM {

    BankDatabase bankDatabase;
    CashDispenser cashDispenser;
    Screen screen;
    Keypad keypad;

    public ATM() {
        this.bankDatabase = new BankDatabase();
        this.cashDispenser = new CashDispenser();
        this.screen = new Screen();
        this.keypad = new Keypad();
    }

    void run(){
        screen.welcome();
        int accountNumber=keypad.readOption();
        System.out.println("PIN: ");
        int pin=keypad.readOption();
        boolean permision=bankDatabase.verifyAccount(accountNumber,pin);
        if (permision){
            Account currentAccount=BankDatabase.getAccount(accountNumber);
            while(true)
            {screen.transactions();
            int option=keypad.readOption();
            switch (option) {
                case 3:
                    Withdrawal withdrawal=new Withdrawal(currentAccount,cashDispenser);
                    withdrawal.execute();
                    break;
                case 2:
                    Deposit deposit=new Deposit(currentAccount);
                    deposit.execute();
                    break;
                case 1:
                    BalanceInquiring balanceInquiring=new BalanceInquiring(currentAccount);
                    balanceInquiring.execute();
                    break;
                case 4:
                    screen.goodbye();
                    this.run();
                    break;
                }
            }
        }
    }

}
