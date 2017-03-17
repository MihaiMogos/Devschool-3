import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {
    private int clientID;
    private int pin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientID != client.clientID) return false;
        return pin == client.pin;
    }

    @Override
    public int hashCode() {
        int result = clientID;
        result = 31 * result + pin;
        return result;
    }
}
