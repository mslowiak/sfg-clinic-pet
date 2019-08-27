package org.pet.clinic.data.Services;

import java.util.Set;

import org.pet.clinic.data.Model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
