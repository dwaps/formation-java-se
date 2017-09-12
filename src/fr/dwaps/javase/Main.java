package fr.dwaps.javase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean leafRepertory = true;
		Scanner sc = new Scanner(System.in);
		String[][] repertory = {
			{
				"Michael",
				"36",
				"contact@dwaps.fr",
				"0651279211",
				"true"
			},
			{
				"Aurélie",
				"27",
				"aurelie@email.fr",
				"0765432199",
				"false"
			},
			{
				"Georges",
				"49",
				"georges@pipo.fr",
				"0654273652",
				"true"
			},
		};
		
		while (leafRepertory) {
			System.out.print("Qui cherchez-vous ? ");
			String prenom = sc.nextLine();
			boolean found = false;
			
			for (String[] contact : repertory) {
				for (String detail : contact) {
					if (detail.equals(prenom)) {
						for (int i = 0; i < contact.length; i++) {
							System.out.println("\t" + contact[i]);
						}
						found = true;
						break;
					}
				}
			}
			
			if (!found) {
				System.out.println("Désolé, ce contact n'existe pas !");
			}
			
			System.out.print("\nSouhaitez-vous effectuer une nouvelle recherche ? [On] ");
			String reponse = sc.nextLine();
			
			if (reponse.equals("n")) {
				System.out.println("Au revoir !");
				leafRepertory = false;
			}
		}
		
		sc.close();
	}

}