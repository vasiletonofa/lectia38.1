package com.tekiwll.lectia381;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	// Spring Context -> Repozitoriu de pastrare a obiecte care au fost create de spring
	// Bean -> Obiectul care a fost creat
	// In Spring Context salvam Bean

	@Qualifier("DepozitDoi")
	@Autowired
	DepositService depositService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		depositService.pastreazaUnitate("Unitate 1");
		depositService.pastreazaUnitate("Unitate 2");

		System.out.println(depositService.getUnitati());
	}
}
