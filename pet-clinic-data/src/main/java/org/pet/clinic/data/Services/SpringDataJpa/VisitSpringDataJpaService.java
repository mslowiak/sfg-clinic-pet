package org.pet.clinic.data.Services.SpringDataJpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.data.Model.Visit;
import org.pet.clinic.data.Repositories.VisitsRepository;
import org.pet.clinic.data.Services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VisitSpringDataJpaService implements VisitService {
	
	private VisitsRepository visitsRepository;
	
	public VisitSpringDataJpaService(VisitsRepository visitsRepository) {
		this.visitsRepository = visitsRepository;
	}
	
	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<>();
		visitsRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return visitsRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		// TODO Auto-generated method stub
		return visitsRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		visitsRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		visitsRepository.deleteById(id);
	}

}
