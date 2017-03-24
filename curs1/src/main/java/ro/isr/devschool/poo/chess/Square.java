package ro.isr.devschool.poo.chess;

/**
 * Created by eduard-gabrielmanda on 14/03/17.
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * clasa = schita a obiectelor pe care vreau sa le creez
 * atribut = caracteristica pe care vreau sa o aiba un obiect
 * metoda  = actiune pe care stie sa o faca obiectul
 * obiect = "produsul finit" creat pe baza schitei
 * constructor = metoda care aloca memorie si initializeaza un obiect
 *             = nu returneaza nimic
 *             = acelasi nume ca numele clasei
 *
 */
@AllArgsConstructor
@NoArgsConstructor
public class Square {
    /*
    Encapsulation - Don't expose to the outside world more than is needed
    modificator de acces :
        private
        default = package
        protected
        public
     */
    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;


}
