package ro.isr.devschool.poo.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by crist on 14-Mar-17.
 */
/*
    clasa = schita a obiectelor pe care vreau sa le creez
    atribut = caracteristica pe care vreau sa o aiba un obiect
    metoda = actiune pe care stie sa o faca obiectul
    obiect = produsul finit creat pe baza schitei
    constructor = metoda care aloca memorie si initializeaza un obiect
                = nu returneaza nimic
                = are acelasi nume ca numele clasei
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Square {
    /*
        Encapsulation - Don't expose to the outside world more than is needed
        modificator de acces:
            private - doar in clasa
            default = package - in pachet
            protected - si in clasele copil
            public - peste tot

        Toate atributele ar trebui sa fie private
     */
    private int row;
    private int column;
     /*
        Folosim lombok pentru get si set si constructori, nu ii mai scriem noi
        daca pun @Getter si @Setter inainte de un atribut, se creeaza gettter si setter doar pentru acel atribut
    */
    /*
    public Square(){
        super(); //desi eu nu il pun, el e acolo
    }
    public int getRow(){
        return this.row;
    }
    public int getColumn(){
        return this.column;
    }
    public void setRow(int row){
        this.row = row;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    */
}
