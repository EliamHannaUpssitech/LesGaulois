package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] listeGaulois = new Gaulois[50];
	private int nombreGaulois = 0;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		listeGaulois[nombreGaulois] = chef;
		nombreGaulois++;
	}
	
	public String getChef() {
		return chef.getNom();
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nombreGaulois < 50) {
			listeGaulois[nombreGaulois] = gaulois;
			nombreGaulois++;
		}
	}
}
