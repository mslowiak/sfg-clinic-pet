package org.pet.clinic.data.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "petsType")
public class PetType extends BaseEntity {
	
	@Column(name = "type")
	private String name;
	
	public PetType() {
		
	}
	
	public PetType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PetType [name=" + name + "]";
	}
	
}
