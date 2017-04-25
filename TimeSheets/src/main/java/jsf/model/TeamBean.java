package jsf.model;

import ejb.TeamFacade;
import jpa.Team;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "teamBean")
@SessionScoped
public class TeamBean implements Serializable {
    @EJB
    private TeamFacade teamFacade;
    @Getter
    @Setter
    private Team selectedTeam;

    public List<Team> getTeams() {
        return teamFacade.getAllTeams();
    }
}