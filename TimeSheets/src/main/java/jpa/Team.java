package jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Map;

@Getter
@Setter
@Builder
@Entity
public class Team {

    @Tolerate
    public Team() {
    }

    @Id
    private int id;

    @Column
    private String name;
}