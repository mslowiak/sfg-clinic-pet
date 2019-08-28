package org.pet.clinic.data.Services;

import org.pet.clinic.data.Model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	Owner findByLastName(String lastName);
	
}
