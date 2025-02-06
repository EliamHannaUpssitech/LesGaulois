package personnages;

public class Soldat extends Romain {
	private Grade grade;
	private Protection[] protection = new Protection[3];
	private int nbProtection = 0;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}

	public Grade getGrade() {
		return grade;
	}

	public void equipement(Protection protection) {
		System.out.println("Le " + donnerAuteur() + " s'équipe avec un " + protection.toString());
		this.protection[this.nbProtection] = protection;
		this.nbProtection++;
	}

	@Override
	public String recevoirCoup(int forceCoup) {
		if (nbProtection > 0) {
			while (forceCoup > 0 && nbProtection > 0) {
				forceCoup -= (this.protection[this.nbProtection - 1].toInt());
				System.out.println("Le " + this.protection[this.nbProtection - 1].toString() + " absorbe "
						+ this.protection[this.nbProtection - 1].toInt() + " du coup.");
				this.nbProtection--;
			}
			perdreVie(forceCoup);
		} else {
			perdreVie(forceCoup);
		}

		if (getForce() > 0) {
			return "Aïe !";
		} else {
			return "J'abandonne...";
		}
	}

}
