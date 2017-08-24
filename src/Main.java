import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String TITRE_APPLICATION[] = Constants.TITRE_APPLICATION;
		final String FIN_APPLICATION = "La calculatrice a bien été fermée ! ;)";
		
		boolean nouveauCalcul = true;
		Scanner sc = new Scanner(System.in);
		
		String reponse = "";
		String operation = "";
		
		Calcul calcul = new Calcul();
		
		System.out.println(TITRE_APPLICATION[0] + "\n" + TITRE_APPLICATION[1] + "\n" + TITRE_APPLICATION[2]);
		
		while (nouveauCalcul) {
			System.out.print("Ton opération : ");
			operation = sc.nextLine();
			
			String[] tab = operation.split(" ");
			calcul.calculate(tab, operation);
			
			System.out.println("Veux-tu effectuer une nouvelle opération ? [On]");
			reponse = sc.nextLine();
			
			if(reponse.equals("n")) {
				nouveauCalcul = false;
			}
			
			operation = "";
		}
		
		System.out.println(FIN_APPLICATION);
		sc.close();
	}

}
