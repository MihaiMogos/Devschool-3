package jsf.model;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

/**
 * Created by Andrei on 20.04.2017.
 */
//@ManagedBean(name="message", eager=true)
@javax.faces.bean.ManagedBean(name="message")
@RequestScoped
public class Message {
    @Getter @Setter
    private String message="Hello JSF World";
}
