package blog.peterstadler.com.blog;
 
import java.util.List;
 
import jakarta.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class EmployeeService {
 
    @Autowired
    private EmployeeRepository repo;
     
    public List<Employee> listAll() {
        return repo.findAll();
    }
     
    public Employee save(Employee employee) {
        return repo.save(employee);
    }
     
    public Employee get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}