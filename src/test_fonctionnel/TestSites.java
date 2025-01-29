package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Potion;
import personnages.Protection;
import personnages.Soldat;
import sites.Village;
import sites.Camp;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Soldat minus = new Soldat("Minus", 7, Grade.CENTURION);
		
		Village village = new Village(vercingetorix);
		Camp camp = new Camp(minus);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 6);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballondebaudrus);
		
		/*
		village.afficherVillageois();
		camp.afficherCamp();
		
		village.changerChef(agecanonix);
		camp.changerCommandant(brutus);
		
		village.afficherVillageois();
		camp.afficherCamp();
		*/
		
		System.out.println("\n");
		
		Druide panoramix = new Druide("Panoramix", 1);
		village.ajouterVillageois(panoramix);
		
		Potion potion = panoramix.fabriquePotion(4, 5);
		panoramix.booster(asterix, potion);
		
		minus.equipement(Protection.BOUCLIER);
		minus.equipement(Protection.CASQUE);
		minus.equipement(Protection.PLASTRON);
		
		while(asterix.getForce() > 0 && minus.getForce() > 0) {
			asterix.frapper(minus);
			if(minus.getForce() > 0) {
				minus.frapper(asterix);
			}
		}
		
	}
}
