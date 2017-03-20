package ro.isr.devschool.poo.chess.tema;

public class Withdrawal {


    private int withdrawalVal;
    private int nrBanknote;
    private boolean cancel;

    public Withdrawal(){
        withdrawalVal=0;
        nrBanknote=0;
        cancel=false;
    }

    public void withdrawal(int state){
        switch(state){
            case 1:
            {
                this.withdrawalVal=20;
                this.nrBanknote=1;
                break;
            }
            case 2:
            {
                this.withdrawalVal=40;
                this.nrBanknote=2;
                break;
            }
            case 3:
            {
                this.withdrawalVal=60;
                this.nrBanknote=3;
                break;
            }
            case 4:
            {
                this.withdrawalVal=100;
                this.nrBanknote=5;
                break;
            }

            case 5:
            {
                this.withdrawalVal=200;
                this.nrBanknote=10;
                break;
            }
            case 6:
            {
                this.cancel=true;
                break;
            }
            default:
                System.out.println("You did not enter a valid selection. Try again.");
                break;


        }
    }

    public boolean getCancel(){
        return this.cancel;
    }


    public void extract(Account withdrawalAcc,CashDispenser cashDispenser ){

        if (cashDispenser.getNrBanknote()>=this.nrBanknote )
        {
            Integer x=this.withdrawalVal;
            Integer y=withdrawalAcc.getAmount();
            if(x.compareTo(y) <=0){
                withdrawalAcc.subAmount(this.withdrawalVal);
                cashDispenser.bancnoteRamase(this.nrBanknote);
            }
            else

                System.out.println("withdrawal value: "+this.withdrawalVal+" > amount:"+withdrawalAcc.getAmount());


        }
        else
            System.out.println("cashDispenser < withdrawalVal");

    }

    public boolean verifyNrBank(){
        if(this.nrBanknote<0){
            return false;
        }
        else return true;
    }


}
