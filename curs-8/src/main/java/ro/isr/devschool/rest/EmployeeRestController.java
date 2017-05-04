package ro.isr.devschool.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.isr.devschool.jpa.Employee;
import ro.isr.devschool.jpa.EmployeeRepository;

import java.util.Collection;

/**
 * Created by Mihai MOGOS on 04/05/17.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    //@javax.inject.Inject
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Employee>> getAll(){
        return new ResponseEntity<>((Collection<Employee>)employeeRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Employee> getEmployeeWithId(@PathVariable Long id){
        return new ResponseEntity<>(employeeRepository.findOne(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addEmployee(@RequestBody Employee input){
        return new ResponseEntity<>(employeeRepository.save(input), HttpStatus.CREATED);
    }

}
