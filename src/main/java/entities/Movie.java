package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "Movie.deleteAllRows", query = "DELETE from Movie")
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int MovYear;
    private String MovTitle;
    private String MovDirector;

    public Movie(int MovYear, String MovTitle, String MovDirector) {
        this.MovYear = MovYear;
        this.MovTitle = MovTitle;
        this.MovDirector = MovDirector;
    }

    public int getMovYear() {
        return MovYear;
    }

    public void setMovYear(int MovYear) {
        this.MovYear = MovYear;
    }

    public String getMovTitle() {
        return MovTitle;
    }

    public void setMovTitle(String MovTitle) {
        this.MovTitle = MovTitle;
    }

    public String getMovDirector() {
        return MovDirector;
    }

    public void setMovDirector(String MovDirector) {
        this.MovDirector = MovDirector;
    }
    
    public Movie() {
    }
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

   
}
