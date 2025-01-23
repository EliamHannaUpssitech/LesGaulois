package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] listeGaulois = new Gaulois[50];
	private int nombreGaulois = 0;

	public Village(Gaulois chef) {
		this.chef = chef;
		chef.parler("Je suis un grand guerrier et je vais cr�er mon village.");
		listeGaulois[nombreGaulois] = chef;
		nombreGaulois++;
	}

	public String getChef() {
		return chef.getNom();
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nombreGaulois < listeGaulois.length) {
			listeGaulois[nombreGaulois] = gaulois;
			nombreGaulois++;
		}
	}

	public void afficherVillageois() {
		System.out.println("Le village de " + getChef() + " est habit� par :");
		for (int i = 0; i < nombreGaulois; i++) {
			System.out.println("- " + listeGaulois[i].getNom());
		}
	}

	public void changerChef(Gaulois gaulois) {
		this.chef = gaulois;
	}
}
