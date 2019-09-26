package org.pet.clinic.data.Repositories;

import org.pet.clinic.data.Model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetsTypeRepository extends CrudRepository<PetType, Long> {

}
