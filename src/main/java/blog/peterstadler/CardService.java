package blog.peterstadler.com.blog;
 
import java.util.List;
 
import jakarta.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class CardService {
 
    @Autowired
    private CardRepository repo;
     
    public List<Card> listAll() {
        return repo.findAll();
    }
     
    public Card save(Card card) {
        return repo.save(card);
    }
     
    public Card get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}