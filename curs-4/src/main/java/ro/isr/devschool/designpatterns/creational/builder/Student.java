package ro.isr.devschool.designpatterns.creational.builder;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Mucefix on 06/04/17.
 */
@Builder
@EqualsAndHashCode @ToString
public class Student {
    private String nume;
    private String prenume;
    private String nrMatricol;
    private int varsta;
    private String cnp;


}
