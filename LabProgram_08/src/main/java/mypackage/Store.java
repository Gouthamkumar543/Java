package mypackage;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "feedbackdb")   // table name in your DB
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String message;

    public Store() {}

    public void setName(String m) {
        name = m;
    }
    public String getName() {
        return name;
    }

    public void setMessage(String m1) {
        message = m1;
    }
    public String getMessage() {
        return message;
    }

    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
}