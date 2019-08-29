package org.pet.clinic.data.Services.Map;

import java.util.Set;

import org.pet.clinic.data.Model.Pet;
import org.pet.clinic.data.Services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
	
	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(),object);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
}
