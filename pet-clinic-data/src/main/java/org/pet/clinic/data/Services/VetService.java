package org.pet.clinic.data.Services;

import java.util.Set;

import org.pet.clinic.data.Model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
