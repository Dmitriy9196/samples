import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Log
@Data
@NoArgsConstructor
public class User {

    private static SessionFactory session = HibernateUtil.getSessionFactory();

    private int id;

    @JsonProperty(value = "name")
    @JacksonXmlProperty(localName = "name")
    private String name;

    @JsonProperty(value = "lastName")
    @JacksonXmlProperty(localName = "lastName")
    private String lastName;

    public void insert() {
        Session sess = session.openSession();
        sess.saveOrUpdate(this);
        sess.close();
    }
}
