package fr.dwaps.classes;

import java.util.Scanner;

import fr.dwaps.beans.Contact;

public class Repertory {
	private Scanner sc;

	public Repertory(Scanner sc) {
		this.sc = sc;
	}
	
	public boolean searchContact() {
		Contact[] repertory = this.getRepertory();
		
		System.out.print("Qui cherchez-vous ? ");
		String prenom = this.sc.nextLine();
		boolean found = false;
		
		for (Contact contact : repertory) {
			if (contact.getPrenom().equals(prenom)) {
				System.out.println(contact.toString());
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("Désolé, ce contact n'existe pas !");
		}
		
		System.out.print("\nSouhaitez-vous effectuer une nouvelle recherche ? [On] ");
		String reponse = sc.nextLine();
		
		if (reponse.equals("n")) {
			System.out.println("Au revoir !");
			return false;
		}
		
		return true;
	}
	
	private Contact[] getRepertory() {
		Contact[] repertory = {
				new Contact(
					"Michael",
					36,
					"contact@dwaps.fr",
					"0651279211",
					true
				),
				new Contact(
					"Aurélie",
					27,
					"aurelie@email.fr",
					"0765432199",
					false
				),
				new Contact(
					"Georges",
					49,
					"georges@pipo.fr",
					"0654273652",
					true
				)
			};
		
		return repertory;
	}
}
