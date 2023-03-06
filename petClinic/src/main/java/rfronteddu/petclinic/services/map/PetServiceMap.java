package rfronteddu.petclinic.services.map;

import rfronteddu.petclinic.model.Pet;
import rfronteddu.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap <T, ID>
        extends AbstractMapService<Pet, Long>
        implements CrudService<Pet, Long>
{
    @Override public Set<Pet> findAll () {
        return super.findAll ();
    }

    @Override public void delete (Pet object) {
        super.delete (object);
    }

    @Override public Pet findById (Long id) {
        return super.findByID (id);
    }

    @Override public Pet save (Pet object) {
        return super.save (object.getId (), object);
    }

    @Override public void deleteByID (Long id) {
        super.deleteById (id);
    }
}
