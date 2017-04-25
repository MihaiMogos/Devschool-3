package jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Setter
@Getter
@Builder
@Entity
public class Employee {
    @Id
    private int id;

    @Tolerate
    public Employee() {
    }

    @Column
    private String name;

    @Column
    private String job;

    @ManyToOne
    private Project project;
}