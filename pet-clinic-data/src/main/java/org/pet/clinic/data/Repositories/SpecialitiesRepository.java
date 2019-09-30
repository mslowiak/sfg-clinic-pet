package org.pet.clinic.data.Repositories;

import org.pet.clinic.data.Model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface SpecialitiesRepository extends CrudRepository<Speciality, Long> {

}
