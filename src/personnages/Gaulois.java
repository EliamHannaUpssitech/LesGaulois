package personnages;

public class Gaulois extends Personnage {
	private int nerf = 0;
	private boolean boost = false;
	private int forcePotion = 0;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	protected String donnerAuteur() {
		return "gaulois";
	}

	public void booster(Potion potion) {
		boost = true;
		forcePotion = potion.getForcePotion();
	}

	@Override
	public void frapper(Personnage personnage) {
		if (getForce() > 0) {
			String nomPersonnage = personnage.getNom();
			System.out.println("Le " + donnerAuteur() + " " + getNom() + " envoie un grand coup au "
					+ personnage.donnerAuteur() + " " + nomPersonnage);
			// Si boosté
			if (boost) {
				personnage.parler(personnage.recevoirCoup((getForce() * (forcePotion - nerf)) / 3));
				if ((forcePotion - nerf) > 1) {
					nerf += 0.5;
				}
			}

			// Si non boosté
			if (!boost) {
				personnage.parler(personnage.recevoirCoup(getForce() / 3));
			}
		}
	}
}
