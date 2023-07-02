package blog.peterstadler.com.blog;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class Card {

  private @Id @GeneratedValue Integer id;
  private String title;
  private String text;
  private Integer position;

  Card() {}

  Card(String title, String text, Integer position) {

    this.title = title;
    this.text = text;
    this.position = position;
  }

  public Integer getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public String getText() {
    return this.text;
  }

  public Integer getPosition() {
    return this.position;
  }


  public void setId(Integer id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }
  

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Card))
      return false;
    Card card = (Card) o;
    return Objects.equals(this.id, card.id) 
        && Objects.equals(this.title, card.title)
        && Objects.equals(this.text, card.text) 
        && Objects.equals(this.position, card.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.title, this.text, this.position);
  }

  @Override
  public String toString() {
    return "Kanban-Card{" + "id=" + this.id + ", position='" + 
    this.position + '\'' + ", title='" + this.title + '\'' +
     ", text='" + this.text + '\''  + '}';
  }
}