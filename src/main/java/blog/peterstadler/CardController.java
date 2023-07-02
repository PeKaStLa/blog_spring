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
public class CardController {
 
    @Autowired
    private CardService service;
     
    // RESTful API methods for Retrieval operations
@GetMapping("/cards")
public List<Card> list() {
    return service.listAll();
}

@GetMapping("/cards/{id}")
public Card get(@PathVariable Integer id) {
    return service.get(id);
}


    // RESTful API method for Create operation
@PostMapping("/cards")
public Card save(@RequestBody Card card) {
    return service.save(card);
}

    // RESTful API method for Update operation
 
    // RESTful API method for Delete operation
@DeleteMapping("/cards/{id}")
public void delete(@PathVariable Integer id) {
    service.delete(id);
}

 
}