package personnages;

public enum Protection {
	CASQUE("casque", 2), PLASTRON("plastron", 3), BOUCLIER("bouclier", 3);
	
	private String nomProtection;
	private int valeurProtection;
	
	private Protection(String nomProtection, int valeurProtection) {
		this.nomProtection = nomProtection;
		this.valeurProtection = valeurProtection;
	}
	
	@Override
	public String toString() {
		return nomProtection;
	}
	
	public int toInt() {
		return valeurProtection;
	}
}
