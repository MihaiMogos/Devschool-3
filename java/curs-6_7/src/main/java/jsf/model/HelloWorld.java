package jsf.model;

import lombok.Setter;

import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by Andrei on 20.04.2017.
 */
//@ManagedBean(name="helloWorld")
@javax.faces.bean.ManagedBean(name ="helloWorld" )
@RequestScoped
public class HelloWorld {
    @ManagedProperty(value = "#{message}")
    @Setter
    private  Message messageBean;

    private String message;

    public HelloWorld(){
        System.out.println("hello jsf world");
    }


    public String getMessage(){
        if(messageBean!=null){
            message=messageBean.getMessage();

        }
        return message;
    }
}
