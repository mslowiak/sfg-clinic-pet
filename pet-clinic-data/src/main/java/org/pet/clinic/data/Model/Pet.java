package org.pet.clinic.data.Model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	@ManyToOne
	@JoinColumn(name = "type_id")
	private PetType petType;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	@Column(name = "birthday")
	private LocalDate birthDate;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
	private Set<Visit> visits = new HashSet<>();
 	public Pet() {
		
	}
	
	public Pet(String name,PetType petType, Owner owner, LocalDate birthDate) {
		super();
		this.name = name;
		this.petType = petType;
		this.owner = owner;
		this.birthDate = birthDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public Set<Visit> getVisits() {
		return visits;
	}

	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}

	@Override
	public String toString() {
		return "Pet [petType=" + petType + ", owner=" + owner + ", birthDate=" + birthDate + "]";
	}
	
	
}
