package fr.dwaps.javase;

import java.util.ArrayList;
import java.util.List;

import fr.dwaps.classes.Lion;
import fr.dwaps.classes.Lionne;
import fr.dwaps.classes.Marmotte;
import fr.dwaps.classes.Tortue;
import fr.dwaps.interfaces.Animal;

public class Main {

	public static void main(String[] args) {
		Lion georges = new Lion();
		Lionne cindy = new Lionne();
		Tortue amandine = new Tortue();
		Marmotte stephanie = new Marmotte();
		
		List<Animal> animaux = new ArrayList<Animal>();
		animaux.add(georges);
		animaux.add(cindy);
		animaux.add(amandine);
		animaux.add(stephanie);
		
		for (Animal animal : animaux) {
			System.out.printf("La %s est plus connue sous le nom de %s.\n", animal.scientificName(), animal.currentName());
		}
		
		System.out.println("\nGeorges est un lion " + georges.getGender());
		System.out.println("Cindy est une lionne " + cindy.getGender());
	}

}
