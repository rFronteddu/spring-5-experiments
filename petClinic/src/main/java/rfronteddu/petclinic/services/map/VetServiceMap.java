package rfronteddu.petclinic.services.map;

import rfronteddu.petclinic.model.Vet;
import rfronteddu.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap <T, ID>
        extends AbstractMapService<Vet, Long>
        implements CrudService<Vet, Long>
{
    @Override public Set<Vet> findAll () {
        return super.findAll ();
    }

    @Override public void delete (Vet object) {
        super.delete (object);
    }

    @Override public Vet findById (Long id) {
        return super.findByID (id);
    }

    @Override public Vet save (Vet object) {
        return super.save (object.getId (), object);
    }

    @Override public void deleteByID (Long id) {
        super.deleteById (id);
    }
}
