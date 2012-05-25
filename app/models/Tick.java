package models;


import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tick extends Model {
    
    @Id
    public Long id;
    
    public Date date;
    
    public String message;

    public Tick() {
        
    }

    public Tick(String message) {
        this.date = new Date();
        this.message = message;
    }
}
