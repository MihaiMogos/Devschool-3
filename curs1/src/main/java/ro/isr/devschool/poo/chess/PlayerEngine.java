package ro.isr.devschool.poo.chess;

/**
 * Created by eduard-gabrielmanda on 14/03/17.
 */
public interface PlayerEngine {

    String test = "valoare de test";

    /**
     * Intr-o interfata putem avea:
     *      - atribute cu conditia ca ele sa fie static si final
     *      - metode abstracte
     *
     * static - atribute si metode care apartin de clasa de obiecte si nu unui anumit obiect
     *        - blocuri statice --> definite in metode sau clase  (se apeleaza o singura data inaintea constructorului)
     *
     * final - in java desemneaza o constanta
     *       - atribute - nu ii mai pot modifica valoarea
     *       - metoda   - nu mai poate fi suprascrisa
     *       - clasa    - nu mai poate fi extinsa
     *       - parametri de metoda - nu mai poate fi "modificat" in interiorul metodei
     *                             - nu isi mai poate modifica valoarea referintiata
     */


    /**
     * o metoda abstracta nu are implementare
     */
    void makeMove();

}
