package org.pet.clinic.data.Repositories;

import org.pet.clinic.data.Model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PetsTypeRepository extends CrudRepository<PetType, Long> {

}
