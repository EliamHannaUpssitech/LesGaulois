package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	private int nerf = 0;
	private boolean boost = false;
	private int forcePotion = 0;
	private Protection[] protection = new Protection[3];
	private int nbProtection = 0;

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

	public void booster(Potion potion) {
		boost = true;
		forcePotion = potion.getForcePotion();
	}

	public void equipement(Protection protection) {
		System.out.println("Le " + donnerAuteur() + " s'équipe avec un " + protection.toString());
		this.protection[this.nbProtection] = protection;
		this.nbProtection++;
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
				// System.out.println(personnage.donnerAuteur() + " " + personnage.force + " pv");
			}

			// Si non boosté
			if (!boost) {
				personnage.parler(personnage.recevoirCoup(this.force / 3));
				// System.out.println(personnage.donnerAuteur() + " " + personnage.force + " pv");
			}
		}
	}

	public String recevoirCoup(int forceCoup) {
		if (nbProtection > 0) {
			while(forceCoup > 0 && nbProtection > 0) {
				forceCoup -= (this.protection[this.nbProtection - 1].toInt());
				System.out.println("Le " + this.protection[this.nbProtection - 1].toString() + " absorbe "
						+ this.protection[this.nbProtection - 1].toInt() + " du coup.");
				this.nbProtection--;
			}
			this.force -= forceCoup;
		} else {
			this.force -= forceCoup;
		}
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
