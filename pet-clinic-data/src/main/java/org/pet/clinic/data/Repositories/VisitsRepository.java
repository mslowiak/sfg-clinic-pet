package org.pet.clinic.data.Repositories;

import org.pet.clinic.data.Model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface VisitsRepository extends CrudRepository<Visit, Long>{

}
