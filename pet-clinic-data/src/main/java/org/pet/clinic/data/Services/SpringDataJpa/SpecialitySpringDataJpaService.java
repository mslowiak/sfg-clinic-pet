package org.pet.clinic.data.Services.SpringDataJpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.data.Model.Speciality;
import org.pet.clinic.data.Repositories.SpecialitiesRepository;
import org.pet.clinic.data.Services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class SpecialitySpringDataJpaService implements SpecialityService {
	
	private SpecialitiesRepository specialitiesRepository;
	
	public SpecialitySpringDataJpaService(SpecialitiesRepository specialitiesRepository) {
		this.specialitiesRepository = specialitiesRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		specialitiesRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		return specialitiesRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		return specialitiesRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		specialitiesRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		specialitiesRepository.deleteById(id);
	}
}
