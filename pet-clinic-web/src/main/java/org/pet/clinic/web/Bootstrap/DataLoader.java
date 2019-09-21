package org.pet.clinic.web.Bootstrap;

import java.time.LocalDate;

import org.pet.clinic.data.Model.Owner;
import org.pet.clinic.data.Model.Pet;
import org.pet.clinic.data.Model.PetType;
import org.pet.clinic.data.Model.Speciality;
import org.pet.clinic.data.Model.Vet;
import org.pet.clinic.data.Services.OwnerService;
import org.pet.clinic.data.Services.PetTypeService;
import org.pet.clinic.data.Services.SpecialityService;
import org.pet.clinic.data.Services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private SpecialityService specialityService;
	
	public DataLoader(OwnerService ownerService,VetService vetService, PetTypeService petTypeService,SpecialityService specialityService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int count = petTypeService.findAll().size();
		if(count == 0) {
			loadData();
		}
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialityService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialityService.save(surgery);
		
		Speciality dentistry = new Speciality();
		dentistry.setDescription("Dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Hichem");
		owner1.setLastName("CHABANE");
		owner1.setAddress("UV15 374 Logements Promotion Dambri");
		owner1.setCity("Constantine");
		owner1.setTelephone("0542216729");
		
		Pet hichemPet = new Pet();
		hichemPet.setName("Rosko");
		hichemPet.setPetType(savedDogPetType);
		hichemPet.setOwner(owner1);
		hichemPet.setBirthDate(LocalDate.now());
		
		owner1.getSetPets().add(hichemPet);
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Mehdi");
		owner2.setLastName("Lebrima");
		owner1.setAddress("Cité Elzawech, Boussouf");
		owner1.setCity("Constantine");
		owner1.setTelephone("0775193612");
		
		Pet mehdiPet = new Pet();
		mehdiPet.setName("Rocky");
		mehdiPet.setPetType(savedCatPetType);
		mehdiPet.setOwner(owner2);
		mehdiPet.setBirthDate(LocalDate.now());
		owner2.getSetPets().add(mehdiPet);
		
		ownerService.save(owner2);
		
		System.out.println("Loaded owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Aymen");
		vet1.setLastName("CHABANE");
		vet1.getSpecialities().add(savedDentistry);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Ahlem");
		vet2.setLastName("Teniou");
		vet2.getSpecialities().add(savedSurgery);
		vetService.save(vet2);
		
		System.out.println("Loaded vets...");
		System.out.println(ownerService.findAll().toString());
		System.out.println(vetService.findAll().toString());
	}

}
