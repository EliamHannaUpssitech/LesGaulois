package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Village;
import sites.Camp;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Soldat minus = new Soldat("Minus", 2, Grade.CENTURION);
		
		Village village = new Village(vercingetorix);
		Camp camp = new Camp(minus);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
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
		
		Druide panoramix = new Druide("Panoramix", 1);
		village.ajouterVillageois(panoramix);
		
		panoramix.fabriquePotion();
		
	}
}
