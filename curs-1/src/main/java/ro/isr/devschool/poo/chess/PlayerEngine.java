package ro.isr.devschool.poo.chess;

/**
 * Created by crist on 14-Mar-17.
 */
public interface PlayerEngine {
    /*
        Intr-o interfata putem avea
            - atribute - statice(atribute si metode care apartin Clasei de obiecte si nu unui anumit obiect)
                            - blocuri statice --> definite in metode si clase
                       - final(nu mai poate fi modificat, este constant)
                            - atribute - nu ii mai pot modifica valoarea
                            - metoda - nu mai poate fi suprascrisa
                            - clasa - nu mai poate fi extinsa
                            - parametri de metoda - nu mai poate fi "modificat" in interiorul metodei
                                                  - nu isi mai poate modifica valoarea referintei (nu pot da new de altceva)
                                                  - pot fi modificate atributele
            - metode abstracte - nu au implementare
        - toate atributele sunt public static final
     */
    void makeMove();
}
