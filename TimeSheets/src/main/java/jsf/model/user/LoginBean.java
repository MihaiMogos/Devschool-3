package jsf.model.user;

import ejb.UserFacade;
import jpa.User;
import lombok.Getter;
import lombok.Setter;
import utils.SessionUtils;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
    @EJB
    private UserFacade userFacade;

    @Getter
    @Setter
    private String nume;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String parola;

    public String authenticateUser(String email, String pass) {
        User user = userFacade.getUserByEmailAndPass(email, pass);
        if (user != null) {
            HttpSession session = SessionUtils.getSession();
            session.setAttribute("username", user.getNume());
            session.setAttribute("userId", user.getId());
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Email and Password",
                            "Please enter correct email and Password"));
        }
        return "login";
    }

    public String add() {
        userFacade.addNewAccount(nume, email, parola);
        return "projects";
    }
}