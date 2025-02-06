package personnages;

import java.security.SecureRandom;

public class Druide extends Gaulois {
	private SecureRandom random;

	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Potion fabriquePotion(int forceMin, int forceMax) {
		int forcePotion = random.nextInt(forceMin, forceMax);
		Potion potion = new Potion(random.nextInt(1, 4), forcePotion);
		parler("J'ai concocté " + potion.getQuantitePotion() + " doses de potion magique. Elle a une force de "
				+ potion.getForcePotion() + ".");
		return potion;
	}
	
	public void booster(Gaulois gaulois, Potion potion) {
		if(potion.getQuantitePotion() > 0) {
			gaulois.booster(potion);
			potion.gauloisBooste();
		}else {
			System.out.println("Plus de potion disponible.");
		}
	}
}
