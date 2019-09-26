package org.pet.clinic.data.Repositories;

import org.pet.clinic.data.Model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetsRepository extends CrudRepository<Pet, Long> {

}
