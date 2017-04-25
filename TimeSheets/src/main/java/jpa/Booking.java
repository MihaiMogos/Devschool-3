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
public class Booking {
    @Id
    private String id;

    @Tolerate
    public Booking() {
    }

    @Column
    private String date;

    @Column
    private int hours;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Employee employee;

}