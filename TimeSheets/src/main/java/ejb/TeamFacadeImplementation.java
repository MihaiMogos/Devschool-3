package ejb;

import jpa.Team;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

@Stateless
public class TeamFacadeImplementation implements TeamFacade {
    @PersistenceContext(unitName = "timesheetsDS")
    private EntityManager entityManager;

    private int id;

    @Override
    public List<Team> getAllTeams() {
        Query query = entityManager.createQuery("SELECT u FROM Team u");
        try {
            return (List<Team>) query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
}
