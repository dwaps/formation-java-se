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
		String reponse = "", operation = "", error = "";
		int  nb1 = 0, nb2 = 0, resultat = 0;
		
		System.out.println(TITRE_APPLICATION[0] + "\n" + TITRE_APPLICATION[1] + "\n" + TITRE_APPLICATION[2]);
		
		while(nouveauCalcul) {
			System.out.print("Premier nombre : ");
			nb1 = sc.nextInt();
			
			System.out.print("Type d'opération [+/-*%] : ");
			operation = sc.next();
			
			System.out.print("Deuxième nombre : ");
			nb2 = sc.nextInt();
			sc.nextLine();
			
			switch(operation) {
				case "+":
					resultat = nb1 + nb2;
					break;
				case "/":
					resultat = nb1 / nb2;
					break;
				case "-":
					resultat = nb1 - nb2;
					break;
				case "*":
					resultat = nb1 * nb2;
					break;
				case "%":
					resultat = nb1 % nb2;
					break;
				default:
					error = "Désolé, je ne peux pas faire le calcul...";
			}
			
			System.out.println((!error.equals("")) ? error : "Résultat de l'opération : " + resultat);
			
			
			System.out.println("Veux-tu effectuer une nouvelle opération ? [On]");
			reponse = sc.nextLine();
			
			if(reponse.equals("n")) {
				nouveauCalcul = false;
			}
			
			error = "";
		}
		
		System.out.println(FIN_APPLICATION);
	}

}
