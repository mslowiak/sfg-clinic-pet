package org.pet.clinic.data.Services.Map;

import java.util.Set;

import org.pet.clinic.data.Model.Visit;
import org.pet.clinic.data.Services.VisitService;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
	
	
	@Override
	public Set<Visit> findAll(){
		return super.findAll();
	}
	
	@Override
	public Visit save(Visit object) {
		if(object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null
				|| object.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit");
		}
		return super.save(object);
	}
	
	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
}
