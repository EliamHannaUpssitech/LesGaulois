package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public String parler(String texteAffiche) {
		return "Le gaulois " + this.nom + " : " + texteAffiche;
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(this.nom + " envoie un grand coup dans la m�choire de " + nomRomain);
		System.out.println(romain.recevoirCoup(this.force / 3));
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix.getNom());
	}
}
