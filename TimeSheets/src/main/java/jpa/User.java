package jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter @Builder
@Entity
public class User {

    @Tolerate
    public User() { }

    @Id
    private int id;

    @Column
    private String nume;

    @Column
    private String email;

    @Column
    private String parola;
}
