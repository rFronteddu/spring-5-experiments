package rfronteddu.petclinic.services;

import rfronteddu.petclinic.model.Pet;
import rfronteddu.petclinic.model.Vet;

import java.util.Set;

public interface VetService
{
    Vet findById (long id);

    Vet save (Vet owner);

    Set<Vet> findAll ();
}
