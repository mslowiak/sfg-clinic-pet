package org.pet.clinic.data.Services.Map;

import java.util.Set;

import org.pet.clinic.data.Model.Owner;
import org.pet.clinic.data.Model.Pet;
import org.pet.clinic.data.Services.OwnerService;
import org.pet.clinic.data.Services.PetService;
import org.pet.clinic.data.Services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("servicemap")
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
	
	private final PetService petService;
	private final PetTypeService petTypeService;
	
	public OwnerServiceMap(PetService petService,PetTypeService petTypeService) {
		this.petService = petService;
		this.petTypeService = petTypeService;
	}
	
	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		if(object != null) {
			if(object.getSetPets() != null) {
				object.getSetPets().forEach(pet -> {
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else {
						throw new RuntimeException("Pet Type is Required");
					}
					
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
		}else {
			return null;
		}
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
