package rfronteddu.petclinic.services.map;

import rfronteddu.petclinic.model.Owner;
import rfronteddu.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap <T, ID>
        extends AbstractMapService<Owner, Long>
        implements CrudService<Owner, Long>
{
    @Override public Set<Owner> findAll () {
        return super.findAll ();
    }

    @Override public void delete (Owner object) {
        super.delete (object);
    }

    @Override public Owner findById (Long id) {
        return super.findByID (id);
    }

    @Override public Owner save (Owner object) {
        return super.save (object.getId (), object);
    }

    @Override public void deleteByID (Long id) {
        super.deleteById (id);
    }
}
