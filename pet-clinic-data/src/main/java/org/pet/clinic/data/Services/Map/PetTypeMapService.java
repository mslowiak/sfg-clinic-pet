package org.pet.clinic.data.Services.Map;

import java.util.Set;

import org.pet.clinic.data.Model.PetType;
import org.pet.clinic.data.Services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("servicemap")
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
}
