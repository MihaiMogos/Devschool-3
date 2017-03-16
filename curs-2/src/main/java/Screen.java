import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
class Screen {
    public static Client afiseazaMesajUserNou(){
        System.out.println("Bine ai venit! Te rugam sa te autentifici cu ID & pin");
        Scanner scan = new Scanner(System.in);
        String[] userInfo = scan.nextLine().split(" ");
        System.out.println("Ai introdus Id-ul " + Integer.parseInt(userInfo[0]) + " si pin-ul " + Integer.parseInt(userInfo[1]));
        Client possibleClient = new Client(Integer.parseInt(userInfo[0]), Integer.parseInt(userInfo[1]));
        return possibleClient;
    }

    public static void afiseazaMesajParametriiIncorecti() {
        System.out.println("Parametrii incorecti. Incearca din nou.");
    }

    public static void afiseazaOptiuni(){
        System.out.println("Alege operatii asupra cont :");
        System.out.println("1: Afiseaza balanta");
        System.out.println("2: Deposit");
        System.out.println("3: Retragere");
        System.out.println("4: Exit");
    }

    public static int afiseazaOptiuniRetragere() {
        System.out.println("Alege operatii retragere : 20, 40, 60, 100, 200");
        Scanner scan = new Scanner(System.in);
        while(!scan.hasNext()) { }
        int retragere = scan.nextInt();
        return retragere;
    }

    public static int afiseazaOptiuniDepozit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ce suma doresti sa introduci in depozit?");
        while(!scan.hasNext()) { }
        return scan.nextInt();
    }
}
