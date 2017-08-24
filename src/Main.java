import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String TITRE_APPLICATION[] = {
				"------------",
				"CALCULATRICE",
				"------------"
		};
		final String FIN_APPLICATION = "La calculatrice a bien été fermée ! ;)";
		
		boolean nouveauCalcul = true;
		Scanner sc = new Scanner(System.in);
		String reponse = "";
		int  nb1 = 0, nb2 = 0;
		
		System.out.println(TITRE_APPLICATION[0] + "\n" + TITRE_APPLICATION[1] + "\n" + TITRE_APPLICATION[2]);
		
		while(nouveauCalcul) {
			System.out.print("Premier nombre : ");
			nb1 = sc.nextInt();
			
			System.out.print("Deuxième nombre : ");
			nb2 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Résultat de l'opération : " + (nb1+nb2));
			
			
			System.out.println("Veux-tu effectuer une nouvelle opération ? (oui ou non)");
			reponse = sc.nextLine();
			
			if(reponse.equals("non")) {
				nouveauCalcul = false;
			}
		}
		
		System.out.println(FIN_APPLICATION);
	}

}
