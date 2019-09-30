package org.pet.clinic.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.pet.clinic")
@EntityScan("org.pet.clinic.data.Model")
@ComponentScan(basePackages = {"org.pet.clinic.data",
		"org.pet.clinic.data.Model",
		"org.pet.clinic.data.Repositories",
		"org.pet.clinic.data.Services",
		"org.pet.clinic.data.Services.Map",
		"org.pet.clinic.data.Services.SpringDataJpa",
		"org.pet.clinic.web"})
public class ClinicApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ClinicApplication.class,args);
	}
	

}
