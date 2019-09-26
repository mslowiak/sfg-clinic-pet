package org.pet.clinic.data.Services.SpringDataJpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.data.Model.Vet;
import org.pet.clinic.data.Repositories.VetsRepository;
import org.pet.clinic.data.Services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetSpringDataJpaService implements VetService {
	
	private final VetsRepository vetsRepository;
	
	public VetSpringDataJpaService(VetsRepository vetsRepository) {
		this.vetsRepository = vetsRepository;
	}
	
	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetsRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		return vetsRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return vetsRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		vetsRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		vetsRepository.deleteById(id);
	}

}
