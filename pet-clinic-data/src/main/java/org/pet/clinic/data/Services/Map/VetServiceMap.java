package org.pet.clinic.data.Services.Map;

import java.util.Set;

import org.pet.clinic.data.Model.Speciality;
import org.pet.clinic.data.Model.Vet;
import org.pet.clinic.data.Services.SpecialityService;
import org.pet.clinic.data.Services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	
	private final SpecialityService specialityService;
	public VetServiceMap(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}
	
	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality -> {
				if(speciality.getId() == null) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(object);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
}
