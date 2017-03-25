/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class CashDispenser {

    private int cashAvailable;

    public CashDispenser(){
        this.cashAvailable=100;
    }

    public int getCashAvailable() {
        return cashAvailable;
    }

    public void eliminateCash(int number) {
        cashAvailable-=number;
    }
}
