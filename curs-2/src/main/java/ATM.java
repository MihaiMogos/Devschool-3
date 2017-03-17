import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ATM {
    private static BankDatabase bankDatabase;
    private static Screen screen;
    private static Keypad keypad;

    static {
        bankDatabase = new BankDatabase();
        screen = new Screen();
        keypad = new Keypad();
    }


    public static void start() {
        Client possibleClient = getActualClient();
        TransactionFactory transactionFactory = new TransactionFactory(possibleClient, bankDatabase, keypad, screen);
        int input = keypad.getUserInput();
        Transaction transaction = transactionFactory.getTransaction(input);
        while (true) {
            if(transaction != null) {
                transaction.executeTransaction();
                screen.showMessage(ATM_StringConstants.SHOW_OPTIONS.toString());
                transaction = transactionFactory.getTransaction(keypad.getUserInput());
            } else{
                start();
            }
        }
    }

    private static Client getActualClient() {
        screen.showMessage(ATM_StringConstants.HELLO.toString());
        int accountId = keypad.getUserInput();
        int pin = keypad.getUserInput();
        Client possibleClient = new Client(accountId, pin);
        boolean isClient = bankDatabase.checkExistingClient(possibleClient);
        if(isClient) {
            screen.showMessage(ATM_StringConstants.SHOW_OPTIONS.toString());
            return possibleClient;
        }else {
            screen.showMessage(ATM_StringConstants.INVALID_USER.toString());
            return getActualClient();
        }
    }
}
