package org.pet.clinic.data.Repositories;

import org.pet.clinic.data.Model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface VetsRepository extends CrudRepository<Vet, Long> {

}
