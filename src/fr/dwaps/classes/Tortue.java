package fr.dwaps.classes;

import fr.dwaps.interfaces.Animal;
import fr.dwaps.interfaces.Herbivore;

public class Tortue implements Animal, Herbivore {

	@Override
	public String[] listOfPlantItCanEat() {
		return new String[] {
				"Salade",
				"Fraises",
				"Tomates"
		};
	}

	@Override
	public String scientificName() {
		return "Testudines";
	}

	@Override
	public String currentName() {
		return "Tortue";
	}

}
