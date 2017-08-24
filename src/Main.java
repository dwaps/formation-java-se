import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String TITRE_APPLICATION[] = getTitle();
		final String FIN_APPLICATION = "La calculatrice a bien été fermée ! ;)";
		
		boolean nouveauCalcul = true;
		Scanner sc = new Scanner(System.in);
		
		String reponse = "";
		String operation = "";
		String error = "";
		
		System.out.println(TITRE_APPLICATION[0] + "\n" + TITRE_APPLICATION[1] + "\n" + TITRE_APPLICATION[2]);
		
		while (nouveauCalcul) {
			System.out.print("Ton opération : ");
			operation = sc.nextLine();
			
			String[] tab = operation.split(" ");
			calculate(tab, error, operation);
			
			System.out.println("Veux-tu effectuer une nouvelle opération ? [On]");
			reponse = sc.nextLine();
			
			if(reponse.equals("n")) {
				nouveauCalcul = false;
			}
			
			operation = "";
			error = "";
		}
		
		System.out.println(FIN_APPLICATION);
		sc.close();
	}
	
	static String[] getTitle() {
		String[] title = {
			"------------",
			"CALCULATRICE",
			"------------"
		};
		
		return title;
	}
	
	static String[] getErrors() {
		String[] errors = {
			"Ton opération n'est pas logique !",
			"Désolé, je ne peux pas faire le calcul...",
			"Navré mais je ne peux que faire des opérations à 2 entiers...",
			"Utiliser les espaces sinon je ne peux pas faire le calcul !"
		};
		
		return errors;
	}
	
	static int calculate(String[] tab, String error, String operation) {
		String ERRORS[] = getErrors();
		boolean stopOperation = false;
		
		int nb1 = 0,
			nb2 = 0,
			resultat = 0,
			index = 0;

		if (tab.length == 3) {
			for (String item : tab) {
				
				try {
					if (nb1 == 0) {
						nb1 = Integer.parseInt(item);
					} else {
						nb2 = Integer.parseInt(item);
						stopOperation = true;
					}
				} catch(NumberFormatException e) {
					if (index % 2 == 1) {
						operation = item;
					} else {
						error = ERRORS[0];
					}
				}
				
				if (nb1 != 0 && nb2 != 0) {
					switch (operation) {
						case "+":
							resultat = nb1 + nb2;
							break;
						case "-":
							resultat = nb1 - nb2;
							break;
						case "/":
							resultat = nb1 / nb2;
							break;
						case "*":
							resultat = nb1 * nb2;
							break;
						case "%":
							resultat = nb1 % nb2;
							break;
						default:
							error = ERRORS[1];
					}
				}
				
				if (stopOperation) {
					break;
				}
				
				index++;
			}
			
		} else if (tab.length > 3) {
			error = ERRORS[2];
		} else {
			error = ERRORS[3];
		}
		
		System.out.println((!error.equals("")) ? error : "Résultat de l'opération : " + resultat);
		
		return resultat;
	}

}
