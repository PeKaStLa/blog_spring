package blog.peterstadler.com.blog;
 
import java.util.*;
 
 import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
 
    @Autowired
    private EmployeeService service;
     
    // RESTful API methods for Retrieval operations
@GetMapping("/employees")
public List<Employee> list() {
    return service.listAll();
}

@GetMapping("/employee/{id}")
public Employee get(@PathVariable Integer id) {
    return service.get(id);
}


    // RESTful API method for Create operation
@PostMapping("/employee")
public Employee save(@RequestBody Employee employee) {
    return service.save(employee);
}

    // RESTful API method for Update operation
 
    // RESTful API method for Delete operation
@DeleteMapping("/employee/{id}")
public void delete(@PathVariable Integer id) {
    service.delete(id);
}

 
}