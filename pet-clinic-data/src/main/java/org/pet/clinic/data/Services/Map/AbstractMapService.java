package org.pet.clinic.data.Services.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.pet.clinic.data.Model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

	private Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T object) {
		if(object != null) {
			if(object.getId() == null) {
				object.setId(getNextID());
			}
			map.put(object.getId(), object);
		}else {
			throw new RuntimeException("Object cannot be null");
		}
		
		return object;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	/* Manage Setting of ID Property */
	private Long getNextID() {
		Long nextID = null;
		try {
			nextID = Collections.max(map.keySet())+1;
		}catch(NoSuchElementException ex) {
			nextID = 1L;
		}
		return nextID;
	}
}
