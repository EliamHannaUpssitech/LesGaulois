package personnages;

import java.security.SecureRandom;

public class Druide extends Gaulois {
	private SecureRandom random;
	private Potion potion;

	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fabriquePotion(int forceMin, int forceMax) {
		int forcePotion = random.nextInt(forceMin, forceMax);
		Potion potion = new Potion(random.nextInt(1, 4), forcePotion);
		parler("J'ai concocté " + potion.getQuantitePotion() + " doses de potion magique. Elle a une force de "
				+ potion.getForcePotion() + ".");
	}
	
	public void booster(Gaulois gaulois) {
		if(potion.getQuantitePotion() > 0) {
			gaulois.booster(potion);
			potion.gauloisBooste();
		}else {
			System.out.println("Plus de potion disponible.");
		}
	}
}
