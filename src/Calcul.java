
public class Calcul {
	private String[] ERRORS;
	private String error;
	private boolean stopOperation;
	private int nb1;
	private int nb2;
	private int resultat;
	private int index;
	
	Calcul() {
		this.ERRORS = Constants.ERRORS;		
		initialize();
	}

	public void calculate(String[] tab, String operation) {
		if (tab.length == 3) {
			for (String item : tab) {
				
				try {
					if (nb1 == 0 && index == 0) {
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
		
		this.initialize();
	}
	
	private void initialize() {
		this.error = "";
		this.stopOperation = false;
		this.nb1 = 0;
		this.nb2 = 0;
		this.resultat = 0;
		this.index = 0;
	}
}
