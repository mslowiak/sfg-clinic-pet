package org.pet.clinic.data.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vets")
public class Vet extends Person {
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vets_specialities",joinColumns = @JoinColumn(name="vet_id"),
			inverseJoinColumns = @JoinColumn(name="speciality_id"))
	private Set<Speciality> specialities = new HashSet<>();
	
	public Vet() {
		
	}
	
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
