package rfronteddu.springFramework.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import rfronteddu.springFramework.springWebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>
{
}
