package org.pet.clinic.web.Bootstrap;

import org.pet.clinic.data.Model.Owner;
import org.pet.clinic.data.Model.Vet;
import org.pet.clinic.data.Services.OwnerService;
import org.pet.clinic.data.Services.VetService;
import org.pet.clinic.data.Services.Map.OwnerServiceMap;
import org.pet.clinic.data.Services.Map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader() {
		this.ownerService = new OwnerServiceMap();
		this.vetService = new VetServiceMap();
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Hichem");
		owner1.setLastName("CHABANE");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Mehdi");
		owner2.setLastName("Lebrima");
		ownerService.save(owner2);
		
		System.out.println("Loaded owners...");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Aymen");
		vet1.setLastName("CHABANE");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(1L);
		vet2.setFirstName("Ahlem");
		vet2.setLastName("Teniou");
		vetService.save(vet2);
		
		System.out.println("Loaded vets...");
	}

}
