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
     
    //findAll records and return them as a list
    public List<Card> listAll() {
        return repo.findAll();
    }
     
    public Card create(Card card) {
        return repo.save(card);
    }

    //use the ID to find an already exisiting record in the DB.
    //Then replace the other attributes with their new values.
    public Card replace(Card newCard, Integer id) {
        // find the current card-record by ID
        // then replace old Titel, old Text and old Position. Then save this as a new record.
        return repo.findById(id)
            .map(card -> {
                card.setTitle(newCard.getTitle());
                card.setText(newCard.getText());
                card.setPosition(newCard.getPosition());
                return repo.save(card);
            })
            //If findByID is unsuccessful, then just save it as a new record.
            .orElseGet(() -> {
                return repo.save(newCard);
            });

    }
     
    //find one record by the ID and return only this one record
    public Card get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}