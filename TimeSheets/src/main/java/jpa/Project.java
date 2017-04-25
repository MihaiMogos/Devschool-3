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
public class Project {

    @Id
    private int id;

    @Tolerate
    public Project() {
    }

    @Column
    private String nume;

    @ManyToOne
    private Team team;
}