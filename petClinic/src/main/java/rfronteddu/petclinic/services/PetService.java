package rfronteddu.petclinic.services;

import rfronteddu.petclinic.model.Owner;
import rfronteddu.petclinic.model.Pet;

import java.util.Set;

public interface PetService
{
    Pet findById (long id);

    Pet save (Pet owner);

    Set<Pet> findAll ();
}
