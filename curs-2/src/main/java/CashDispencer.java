/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class CashDispencer {

    private int availableCash;

    public CashDispencer() {
        availableCash = 1000;
    }

    public boolean hasEnoughCash(int amountToWithdraw) {
        if (amountToWithdraw <= availableCash) {
            return true;
        }
        return false;
    }

    public void decreaseAvailableCash(int amountToWithdraw) {
        availableCash -= amountToWithdraw;
    }
}
