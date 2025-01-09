package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public String parler(String texteAffiche) {
		return "Le romain " + this.nom + " : " + texteAffiche;
	}

	public String recevoirCoup(int forceCoup) {
		this.force -= forceCoup;
		if (this.force < 0) {
			this.force = 0;
		}
		if (this.force > 0) {
			return "Aïe !";
		} else {
			return "J'abandonne...";
		}
	}
}
