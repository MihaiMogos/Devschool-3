import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Deposit implements Transaction {
    Client client;
    BankDatabase bankDatabase;
    Keypad keypad;
    Screen screen;

    @Override
    public void executeTransaction() {
        screen.showMessage(ATM_StringConstants.DEPOSIT_VALUE.toString());
        int depositValue = keypad.getUserInput();
        int currentAmount = bankDatabase.getClientAmount(client);
        currentAmount += depositValue;
        bankDatabase.updateClientBalance(client, currentAmount);
        screen.showMessage("Your current amount is: " + currentAmount);
    }
}
