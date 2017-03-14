package ro.isr.devschool.poo.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Mucefix on 14/03/17.
 */
/*
clasa = schita a obiectelor pe care vreau sa le creez
atribut = caracteristica pe care vreau sa o aiba un obiect
metoda = actiune pe care stie sa o faca obiectul
obiect = "produsul finit" creat pe baza schitei
constructor = metoda care aloca memorie si initializeaza un obiect
            = nu returneaza nimic
            = are acelasi nume ca numele clasei
 */
@AllArgsConstructor
@NoArgsConstructor
public class Square {

    /*
    Encapsulation - Don't expose to the outside world more than is needed
    modificatori de acces:
        private
        default = package
        protected
        public

     */
    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;

    /*
    public Square(){
        super();
    }
    */

    /*
    public int getRow(){
        return this.row;
    }

    public void setRow(int row){
        this.row = row;
    }
    */
}
