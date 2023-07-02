package blog.peterstadler.com.blog;

import org.springframework.data.jpa.repository.JpaRepository;

interface CardRepository extends JpaRepository<Card, Integer> {

}