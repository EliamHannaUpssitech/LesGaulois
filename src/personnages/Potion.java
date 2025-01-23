package personnages;

public class Potion {
	private int quantitePotion = 0;
	private int forcePotion = 0;

	public Potion(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public int getQuantitePotion() {
		return quantitePotion;
	}

	public int getForcePotion() {
		return forcePotion;
	}
}
