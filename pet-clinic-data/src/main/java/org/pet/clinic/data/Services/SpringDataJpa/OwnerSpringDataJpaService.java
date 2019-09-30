package org.pet.clinic.data.Services.SpringDataJpa;

import java.util.HashSet;
import java.util.Set;

import lombok.RequiredArgsConstructor;
import org.pet.clinic.data.Model.Owner;
import org.pet.clinic.data.Repositories.OwnersRepository;
import org.pet.clinic.data.Repositories.PetsRepository;
import org.pet.clinic.data.Repositories.PetsTypeRepository;
import org.pet.clinic.data.Services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
@RequiredArgsConstructor
public class OwnerSpringDataJpaService implements OwnerService {
	
	private final OwnersRepository ownersRepository;
	private final PetsRepository petsRepository;
	private final PetsTypeRepository petsTypeRepository;

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownersRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return ownersRepository.findById(id).orElse(null);
		/*Optional<Owner> optionalOwner = ownersRepository.findById(id);
		if(optionalOwner.isPresent()) {
			return optionalOwner.get();
		}else {
			return null;
		}*/
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return ownersRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownersRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		ownersRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return ownersRepository.findByLastName(lastName);
	}
}
