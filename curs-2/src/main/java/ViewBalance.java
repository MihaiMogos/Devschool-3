import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ViewBalance implements  Transaction{

    Client client;
    BankDatabase bankDatabase;
    Screen screen;

    @Override
    public void executeTransaction() {
        int clientAmount = bankDatabase.getClientAmount(client);
        screen.showMessage("Your amount is: " + clientAmount);
    }
}
