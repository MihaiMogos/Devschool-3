package jsf.model;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message", eager = true)
@RequestScoped

public class Message {

    @Getter @Setter
    private String message = "Hello JSF World";
}
