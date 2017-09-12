package fr.dwaps.classes;

import fr.dwaps.interfaces.Animal;
import fr.dwaps.interfaces.Carnivore;

public class Lionne extends Femelle implements Animal, Carnivore {
	
	public Lionne() {}
	
	public String getGender() {
		return super.gender;
	}

	@Override
	public String[] listOfAnimalsItCanEat() {
		return new String[] {
			"Gazelle",
			"Antiloppe",
			"Zèbre"
		};
	}

	@Override
	public String scientificName() {
		return "Panthera leo";
	}

	@Override
	public String currentName() {
		return "Lionne";
	}
}
