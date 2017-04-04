import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransactionFactory {
    Client client;
    BankDatabase bankDatabase;
    Keypad keypad;
    Screen screen;


    public Transaction getTransaction(int transaction){
        if(TransactionType.DEPOSIT.getId() == transaction){
            return new Deposit(client, bankDatabase, keypad, screen);

        } else if(TransactionType.VIEW_BALANCE.getId() == transaction){
            return new ViewBalance(client, bankDatabase, screen);

        } else if(TransactionType.WITHDRAWAL.getId() == transaction){
            return new Withdrawal(client, bankDatabase, keypad, screen);
        } else
            return null;
    }
}
