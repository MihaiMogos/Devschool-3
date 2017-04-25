package ejb;

import jpa.Project;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class ProjectFacadeImplementation implements ProjectFacade {

    @PersistenceContext(unitName = "timesheetsDS")
    private EntityManager entityManager;

    @Override
    public List<Project> getAllProjects() {
        Query query = entityManager.createQuery("SELECT p FROM Project p");
        return (List<Project>) query.getResultList();
    }

    @Override
    public List<Project> getAllProjectsForCorrespondentTeam(int teamId) {
        Query query = entityManager.createQuery("SELECT p FROM Project p WHERE p.team.id = :teamId");
        query = query.setParameter("teamId", teamId);
        return (List<Project>) query.getResultList();
    }
}