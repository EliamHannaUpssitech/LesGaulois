package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix.parler("Bonjour � tous"));
		Romain minus = new Romain("Minus", 6);
		System.out.println(minus.parler(" UN GAU� UN GAUGAU�"));
		/*
		 * for(int i=0; i<2; i++) { System.out.println(minus.recevoirCoup(3)); }
		 */
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
	}
}
