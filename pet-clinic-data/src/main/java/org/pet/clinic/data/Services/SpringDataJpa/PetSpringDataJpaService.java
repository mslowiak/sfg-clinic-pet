package org.pet.clinic.data.Services.SpringDataJpa;

import java.util.HashSet;
import java.util.Set;

import lombok.RequiredArgsConstructor;
import org.pet.clinic.data.Model.Pet;
import org.pet.clinic.data.Repositories.PetsRepository;
import org.pet.clinic.data.Services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
@RequiredArgsConstructor
public class PetSpringDataJpaService implements PetService {
	
	private final PetsRepository petsRepository;

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<Pet>();
		petsRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		return petsRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet object) {
		return petsRepository.save(object);
	}

	@Override
	public void delete(Pet object) {
		petsRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		petsRepository.deleteById(id);
	}
}
