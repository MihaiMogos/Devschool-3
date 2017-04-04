import lombok.AllArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
public class Withdrawal implements Transaction{
    Client client;
    BankDatabase bankDatabase;
    Keypad keypad;
    Screen screen;

    private static int CASH_DISPENSER;
    private static ArrayList<Integer> possbileValues = new ArrayList<>();
    static {
        possbileValues.add(20);
        possbileValues.add(40);
        possbileValues.add(60);
        possbileValues.add(100);
        possbileValues.add(200);
        CASH_DISPENSER = 1000;
    }

    @Override
    public void executeTransaction() {
        screen.showMessage(ATM_StringConstants.WITHDRAWAL.toString());
        int value = keypad.getUserInput();
        if(value -1 > 5)
            value = 0;
        else
            value = possbileValues.get(value -1);
        CASH_DISPENSER -= value;
        if(CASH_DISPENSER <= 0) {
            screen.showMessage("No more money.");
            return;
        }
        int currentAmount = bankDatabase.getClientAmount(client);
        currentAmount -= value;
        bankDatabase.updateClientBalance(client, currentAmount);
        screen.showMessage("Your current amount is " + currentAmount);
    }
}
