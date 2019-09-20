package org.pet.clinic.data.Model;

import java.util.Set;

public class Owner extends Person {
	
	private Set<Pet> setPets;
	
	public Owner() {
		
	}
	
	public Owner(Set<Pet> setPets) {
		this.setPets = setPets;
	}

	public Set<Pet> getSetPets() {
		return setPets;
	}

	public void setSetPets(Set<Pet> setPets) {
		this.setPets = setPets;
	}
	
	
}
