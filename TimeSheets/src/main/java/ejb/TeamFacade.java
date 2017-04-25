package ejb;

import jpa.Team;

import javax.ejb.Local;
import java.util.List;

@Local
public interface TeamFacade {
    List<Team> getAllTeams();
}