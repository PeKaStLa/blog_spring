package blog.peterstadler.com.blog;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class Employee {

  private @Id @GeneratedValue Integer id;
  private String title;
  private String text;
  private String type;
  private String date;

  Employee() {}

  Employee(String title, String text, String type, String date) {

    this.title = title;
    this.text = text;
    this.type = type;
    this.date = date;
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

  public String getType() {
    return this.type;
  }

  public String getDate() {
    return this.date;
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

  public void setType(String type) {
    this.type = type;
  }
  
  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Employee))
      return false;
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) 
        && Objects.equals(this.title, employee.title)
        && Objects.equals(this.text, employee.text) 
        && Objects.equals(this.type, employee.type)
        && Objects.equals(this.date, employee.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.title, this.text, this.type, this.date);
  }

  @Override
  public String toString() {
    return "Kanban-Card{" + "id=" + this.id + ", type='" + this.type + '\'' + ", title='" + this.title + '\'' + ", text='" + this.text + '\'' + ", date='" + this.date + '\'' + '}';
  }
}