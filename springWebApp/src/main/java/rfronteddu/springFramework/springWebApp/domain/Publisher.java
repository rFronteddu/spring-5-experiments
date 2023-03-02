package rfronteddu.springFramework.springWebApp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Publisher
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;

    @OneToMany
    @JoinColumn (name = "publisher_id")
    private Set<Book> books = new HashSet<> ();

    // < ------------------------------------------------------------------------------------------------------------- >

    public Publisher (String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override public String toString () {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass () != o.getClass ()) {
            return false;
        }

        Publisher publisher = (Publisher) o;

        return Objects.equals (id, publisher.id);
    }

    @Override public int hashCode () {
        return id != null ? id.hashCode () : 0;
    }
}
