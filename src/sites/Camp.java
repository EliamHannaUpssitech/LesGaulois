package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] listeSoldat = new Soldat[80];
	private int nombreSoldat = 0;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		listeSoldat[nombreSoldat] = commandant;
		nombreSoldat++;
	}
	
	public String getCommandant() {
		return commandant.getNom();
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if (nombreSoldat < 80) {
			listeSoldat[nombreSoldat] = soldat;
			nombreSoldat++;
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + getCommandant() + " contient les soldats :");
		for(int i=0; i<nombreSoldat; i++) {
			System.out.println("- " + listeSoldat[i].getNom());
		}
	}
	
	public void changerCommandant(Soldat soldat) {
		if(soldat.getGrade() == Grade.CENTURION) {
			this.commandant = soldat;
		}
	}
}
