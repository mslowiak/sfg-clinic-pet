package org.pet.clinic.data.Repositories;

import org.pet.clinic.data.Model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnersRepository extends CrudRepository<Owner, Long> {
 
	//Generate findByLastName
	Owner findByLastName(String lastName);
}
