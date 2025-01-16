package test_fonctionnel;

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
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village.");
		Camp camp = new Camp(minus);
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		
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
		
	}
}
