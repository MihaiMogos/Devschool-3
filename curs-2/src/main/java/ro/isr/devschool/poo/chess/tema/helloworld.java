package ro.isr.devschool.poo.chess.tema;


import ro.isr.devschool.poo.chess.tema.*;

import java.util.ArrayList;
import java.util.List;

public class helloworld {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(123,321,100));
        accounts.add(new Account(234,432,2000));
        accounts.add(new Account(345,543,3000));
        CashDispenser cashDispenser = new CashDispenser(12);


        Authenticated isAuthenticated=new Authenticated();
        Display display=new Display();
        Account resAcc=new Account(0,0,0);
        int stateMenu;
        Menu mainMenu=new Menu(0);
        boolean stateExit=false;

        do
        {


            for(;;)
            {
                Keypad nrAcc=new Keypad("nrAcc:");
                resAcc=Account.getAccount(accounts,nrAcc.getData());

                if(resAcc!=null)
                    break;

                display.displayMessage("Account nr is not ok ");
            }

            for(;;)
            {

                Keypad pin=new Keypad("pin:");

                if(pin.getData()==resAcc.getPinAcc())
                {
                    isAuthenticated.setIsAuthenticated(true);
                    stateExit=false;
                    break;
                }
                display.displayMessage("pin is not ok");
            }

            display.displayMessage("\namount: "+resAcc.getAmount());



            do{

                display.displayMainMenu();

                for(;;)
                {
                    Keypad nrMenu=new Keypad("");
                    stateMenu=mainMenu.SwitchMenu(nrMenu.getData());

                    if(stateMenu!=0)
                        break;

                    display.displayMessage("Please choose a number between 1,2,3,4,5");
                }

                Withdrawal withdrawlVal=new Withdrawal();

                switch(stateMenu){
                    case 1:
                    {
                        display.displayMessage("your balance: "+resAcc.getAmount()+"usd\n");
                        break;
                    }
                    case 2:
                    {
                        Keypad debitVal=new Keypad("debit:");
                        resAcc.addAmount(debitVal.getData());
                        break;
                    }
                    case 3:
                    {
                        display.displayWithdrawalMenu();
                        Keypad withdrawal=new Keypad("");
                        int withdrawalVal=withdrawal.getData();
                        withdrawlVal.withdrawal(withdrawalVal);

                        if(withdrawlVal.getCancel()==false)
                            withdrawlVal.extract(resAcc,cashDispenser);

                        break;
                    }
                    case 4:
                    {
                        isAuthenticated.setIsAuthenticated(false);
                        stateExit=true;
                        break;
                    }
                    case 5:
                    {
                        System.exit(0);
                        break;
                    }
                    default:
                        display.displayMessage("\nYou did not enter a valid selection. Try again. Choose a number between 1,2,3,4,5");
                        break;

                }

            }while(stateExit!=true);


        }while(isAuthenticated.getIsAuthenticated()!=true);

    }

}
