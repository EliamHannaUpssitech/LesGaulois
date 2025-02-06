package personnages;

public abstract class Personnage {
	private String nom;
	private int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texteAffiche) {
		System.out.println("Le " + donnerAuteur() + " " + this.nom + " : " + texteAffiche);
	}

	protected abstract String donnerAuteur();

	public void frapper(Personnage personnage) {
		if (this.force > 0) {
			String nomPersonnage = personnage.getNom();
			System.out.println("Le " + donnerAuteur() + " " + this.nom + " envoie un grand coup au "
					+ personnage.donnerAuteur() + " " + nomPersonnage);
			personnage.parler(personnage.recevoirCoup(this.force / 3));
		}
	}

	public void perdreVie(int viePerdue) {
		this.force -= viePerdue;
	}

	public String recevoirCoup(int forceCoup) {
		perdreVie(forceCoup);

		if (this.force > 0) {
			return "Aïe !";
		} else {
			return "J'abandonne...";
		}
	}
}
