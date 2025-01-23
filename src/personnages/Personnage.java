package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	private int nerf = 0;
	private boolean boost = false;
	private int forcePotion = 0;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texteAffiche) {
		System.out.println("Le " + donnerAuteur() + " " + this.nom + " : " + texteAffiche);
	}

	protected abstract String donnerAuteur();

	public void booster(Potion potion) {
		boost = true;
		forcePotion = potion.getForcePotion();
	}

	public void frapper(Personnage personnage) {
		if (this.force > 0) {
			String nomPersonnage = personnage.getNom();
			System.out.println("Le " + donnerAuteur() + " " + this.nom + " envoie un grand coup au "
					+ personnage.donnerAuteur() + " " + nomPersonnage);
			// Si boosté
			if (boost) {
				personnage.parler(personnage.recevoirCoup((this.force * (forcePotion - nerf)) / 3));
				if ((forcePotion - nerf) > 1) {
					nerf += 0.5;
				}
				System.out.println((this.force * (forcePotion - nerf)) / 3);
			}

			// Si non boosté
			if (!boost) {
				personnage.parler(personnage.recevoirCoup(this.force / 3));
				System.out.println(this.force / 3);
			}
		}
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
