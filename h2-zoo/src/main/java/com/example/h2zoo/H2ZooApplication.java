package com.example.h2zoo;

import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.model.Bird;
import com.example.h2zoo.model.Mammal;

import com.example.h2zoo.repository.ReptileRepository;
import com.example.h2zoo.repository.BirdRepository;
import com.example.h2zoo.repository.MammalRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;


@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2ZooApplication.class, args);

		//Reptile Data
		ReptileRepository reptileRepository = configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile leviathan = new Reptile("Annihilator", "Dragon", "Black", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, leviathan));

		//Bird Data
		BirdRepository birdRepository = configurableApplicationContext.getBean(BirdRepository.class);
		Bird owl = new Bird("Tootsie", "Bird", "Brown", "Candivore");
		Bird eagle = new Bird("Sun", "Bird", "Gold", "Carnivore");
		birdRepository.saveAll(List.of(owl, eagle));

		//Mammal Data
		MammalRepository mammalRepository = configurableApplicationContext.getBean(MammalRepository.class);
		Mammal dog = new Mammal("Krypto", "Dog", "White", "Super");
		Mammal ape = new Mammal("Grod", "Gorilla", "Black", "Superman");
		mammalRepository.saveAll(List.of(dog, ape));

	}

}
