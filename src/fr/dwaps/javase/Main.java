package fr.dwaps.javase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MaFenetre fenetre = new MaFenetre();
		Scanner sc = new Scanner(System.in);
		boolean continuer = true;
		
		while (continuer) {
			System.out.print("Largeur ? ");
			int w = sc.nextInt();
			sc.nextLine();
			System.out.print("Hauteur ? ");
			int h = sc.nextInt();
			sc.nextLine();
			
			fenetre.setSize(w, h);
			
			System.out.print("Redimentionner à nouveau ? [oN] ");
			String reponse = sc.nextLine();
			
			continuer = reponse.equals("o");
		}
		
		System.out.println("Aurevoir !");
		sc.close();
		System.exit(0);
	}

}
