import java.util.HashMap;

public class BankDatabase {
    private HashMap<Client, Integer> database;

    public BankDatabase() {
        database = new HashMap<Client, Integer>();;
        Client client1 = new Client(1, 123);
        Client client2 = new Client(2, 456);
        Client client3 = new Client(3, 789);
        Client client4 = new Client(4, 147);
        Client client5 = new Client(5, 258);

        database.put(client1, 500);
        database.put(client2, 500);
        database.put(client3, 500);
        database.put(client4, 500);
        database.put(client5, 500);
    }

    public boolean checkExistingClient(Client client){
        return database.containsKey(client);
    }

    public int getClientAmount(Client client){
        return database.get(client);
    }

    public void updateClientBalance(Client client, int amount){
        database.put(client, amount);
    }
}
