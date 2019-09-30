package org.pet.clinic.data.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "petsType")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class PetType extends BaseEntity {
	
	@Column(name = "type")
	private String name;

	@Override
	public String toString() {
		return "PetType [name=" + name + "]";
	}
}
