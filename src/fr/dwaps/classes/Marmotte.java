package fr.dwaps.classes;

import fr.dwaps.interfaces.Animal;
import fr.dwaps.interfaces.Herbivore;

public class Marmotte implements Animal, Herbivore {

	@Override
	public String[] listOfPlantItCanEat() {
		return new String[] {
				"Trèfle",
				"Thin",
				"Pissenlits"
		};
	}

	@Override
	public String scientificName() {
		return "Marmota";
	}

	@Override
	public String currentName() {
		return "Marmotte";
	}

}
