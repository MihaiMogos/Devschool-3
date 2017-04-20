package jsf.model;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Mihai MOGOS on 20/04/17.
 */
@ManagedBean(name = "message")
@RequestScoped
public class Message {
    @Getter @Setter
    private String message = "Hello JSF World!";

}
