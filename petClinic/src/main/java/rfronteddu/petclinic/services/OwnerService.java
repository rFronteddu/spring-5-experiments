package rfronteddu.petclinic.services;

import rfronteddu.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>
{
    Owner findByLastName (String lastName);
}
