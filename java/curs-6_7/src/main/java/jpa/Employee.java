package jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Andrei on 20.04.2017.
 */
@Getter @Setter @Builder
@Entity
public class Employee {
    @Tolerate
    public Employee(){}
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private double salary;




}
