package org.pet.clinic.data.Services.SpringDataJpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.data.Model.PetType;
import org.pet.clinic.data.Repositories.PetsTypeRepository;
import org.pet.clinic.data.Services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class PetTypeSpringDataJpaService implements PetTypeService {
	
	private final PetsTypeRepository petsTypeRepository;

	public PetTypeSpringDataJpaService(PetsTypeRepository petsTypeRepository) {
		this.petsTypeRepository = petsTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		petsTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType findById(Long id) {
		return petsTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return petsTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		petsTypeRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		petsTypeRepository.deleteById(id);
	}
	
	
}
