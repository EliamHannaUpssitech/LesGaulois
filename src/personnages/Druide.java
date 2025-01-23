package personnages;

public class Druide extends Gaulois {

	public Druide(String nom, int force) {
		super(nom, force);
	}

	public void fabriquePotion() {
		Potion potion = new Potion(2, 4);
		parler("J'ai concocté " + potion.getQuantitePotion() + " doses de potion magique. Elle a une force de "
				+ potion.getForcePotion() + ".");
	}

}
