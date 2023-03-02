package rfronteddu.springFramework.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import rfronteddu.springFramework.springWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>
{
}
