import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;

@AllArgsConstructor
public class ATM {
    private static int AVAILABLE_AMOUNT = 1000;
    private static ArrayList<Integer> optiuniRetragere = new ArrayList<>();

    static{
        optiuniRetragere.add(20);
        optiuniRetragere.add(40);
        optiuniRetragere.add(60);
        optiuniRetragere.add(100);
        optiuniRetragere.add(200);
    }

    /* ATM-ul foloseste un database al bancii */
    private static BankDatabase bankDatabase = new BankDatabase();
    private static Screen ecran = new Screen();

    public static void start() {
        while(true) {
           Client possibleClient = ecran.afiseazaMesajUserNou();
            boolean isClient = bankDatabase.checkExistingClient(possibleClient);
            if(!isClient){
                ecran.afiseazaMesajParametriiIncorecti();
            }else {
                ecran.afiseazaOptiuni();
                dealWithCurrUser(possibleClient, ecran);
            }
        }
    }

    private static void dealWithCurrUser(Client possibleClient, Screen screen){
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        while(!scan.hasNext()) { }
        int operation = scan.nextInt();
        switch (operation){
            case 1:
                int amount = bankDatabase.getClientAmount(possibleClient);
                System.out.println("Balanta curenta este: " + amount);
                screen.afiseazaOptiuni();
                dealWithCurrUser(possibleClient, ecran);

            case 2:
                int depositValue = screen.afiseazaOptiuniDepozit();
                int currAmount = bankDatabase.getClientAmount(possibleClient);
                currAmount += depositValue;
                bankDatabase.updateClientBalance(possibleClient, currAmount);
                System.out.println("Balanta curenta este: " + currAmount);
                screen.afiseazaOptiuni();
                dealWithCurrUser(possibleClient, ecran);

            case 3:
                int optiune = screen.afiseazaOptiuniRetragere();
                if(AVAILABLE_AMOUNT < optiune){
                    System.out.println("ATM-ul nu are sufienti bani!");
                }
                int currClientSum = bankDatabase.getClientAmount(possibleClient);
                currClientSum -= optiune;
                bankDatabase.updateClientBalance(possibleClient, currClientSum);
                System.out.println("Balanta curenta este: " + currClientSum);
                screen.afiseazaOptiuni();
                dealWithCurrUser(possibleClient, ecran);

            case 4:
               start();
        }
    }
}
