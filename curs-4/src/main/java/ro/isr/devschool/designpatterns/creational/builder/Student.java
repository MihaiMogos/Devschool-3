package ro.isr.devschool.designpatterns.creational.builder;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by scipianus on 06-Apr-17.
 */
@EqualsAndHashCode
@ToString
@Builder
public class Student {
    private String nume;
    private String prenume;
    private String cnp;
    private int varsta;
}
