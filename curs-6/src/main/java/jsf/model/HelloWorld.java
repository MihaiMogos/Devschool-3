package jsf.model;

import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by Mihai MOGOS on 20/04/17.
 */
@ManagedBean(name = "helloWorld")
@RequestScoped
public class HelloWorld {

    @ManagedProperty(value = "#{message}")
    @Setter
    private Message messageBean;

    private String message;

    public HelloWorld() {
        System.out.println("Hello JSF World");
    }

    public String getMessage(){
        if( messageBean != null ){
            message = messageBean.getMessage();
        }
        return message;
    }

}
