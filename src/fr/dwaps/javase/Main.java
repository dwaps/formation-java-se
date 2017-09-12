package fr.dwaps.javase;

import java.util.Scanner;

import fr.dwaps.classes.Repertory;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Repertory repertory = new Repertory(sc);
		boolean leafRepertory = true;
		
		while (leafRepertory) {
			leafRepertory = repertory.searchContact();
		}
		
		sc.close();
		System.exit(0);
	}

}
