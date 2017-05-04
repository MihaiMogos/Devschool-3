package ro.isr.devschool.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.isr.devschool.jpa.EmployeeRepository;

/**
 * Created by Mihai MOGOS on 04/05/17.
 */
@Controller
public class HomeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("employees", employeeRepository.findAll());
        return "index";
    }
}
