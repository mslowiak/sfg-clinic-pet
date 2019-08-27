package org.pet.clinic.data.Services;

import java.util.Set;

import org.pet.clinic.data.Model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}	
