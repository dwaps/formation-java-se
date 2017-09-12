package fr.dwaps.classes;

public class Draw {
	public void house(boolean slowly) {
		int[][] maison = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,6,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0},
			{0,0,0,0,0,0,0,0,4,0,0,0,6,0,0,0,0},
			{0,0,0,0,0,0,0,4,4,4,0,5,0,0,0,0,0},
			{9,0,0,0,0,0,4,4,4,4,4,5,0,0,0,0,0},
			{9,9,0,0,0,4,4,4,4,4,4,4,0,0,0,0,0},
			{9,9,9,0,4,4,4,4,4,4,4,4,4,0,0,0,0},
			{9,9,0,0,1,0,0,0,0,0,0,0,2,0,0,0,0},
			{8,0,0,0,1,0,0,0,3,3,0,0,2,0,0,0,0},
			{8,0,0,0,1,0,0,0,3,3,0,0,2,0,0,0,0},
			{8,0,0,0,1,0,0,0,3,3,0,0,2,0,0,7,7},
			{7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7},
			{7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
		};
		String str = "";
		
		for (int[] row: maison) {
			for (int col: row) {
				switch (col) {
					case 0: str = "  "; break; // ciel
					case 1: str = "||"; break; // mur de gauche
					case 2: str = "|"; break; // mur de droite
					case 3: str = "= "; break; // porte
					case 4: str = "@ "; break; // toit
					case 5: str = " M"; break; // cheminée
					case 6: str = "°"; break; // fumée
					case 7: str = "_ "; break; // terrain
					case 8: str = "| "; break; // tronc
					case 9: str = "88"; break; // fueillage
				}
				System.out.print(str);
				if (slowly) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.print("\n");
		}
	}
}
