package org.pet.clinic.web.Bootstrap;

import java.time.LocalDate;

import org.pet.clinic.data.Model.Owner;
import org.pet.clinic.data.Model.Pet;
import org.pet.clinic.data.Model.PetType;
import org.pet.clinic.data.Model.Vet;
import org.pet.clinic.data.Services.OwnerService;
import org.pet.clinic.data.Services.PetTypeService;
import org.pet.clinic.data.Services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	public DataLoader(OwnerService ownerService,VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
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
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Ahlem");
		vet2.setLastName("Teniou");
		vetService.save(vet2);
		
		System.out.println("Loaded vets...");
		System.out.println(ownerService.findAll().toString());
		System.out.println(vetService.findAll().toString());
	}

}
