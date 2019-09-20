package org.pet.clinic.data.Model;

import java.util.Set;

public class Vet extends Person {
	
	private Set<Speciality> specialities;

	public Vet(Set<Speciality> specialities) {
		super();
		this.specialities = specialities;
	}

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
	
}
