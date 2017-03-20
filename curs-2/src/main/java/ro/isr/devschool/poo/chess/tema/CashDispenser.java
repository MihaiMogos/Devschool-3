package ro.isr.devschool.poo.chess.tema;

public class CashDispenser {
    private int nrBanknote;
    public CashDispenser(int nrBanknote){
        this.nrBanknote=nrBanknote;
    }

    public void setNrBanknote(int nrBanknote){
        this.nrBanknote=nrBanknote;
    }

    public int getNrBanknote(){
        return this.nrBanknote;
    }

    public void bancnoteRamase(int nrbank){
        this.nrBanknote-=nrbank;
        System.out.println("nrBanknotes: "+this.nrBanknote);
    }

}
