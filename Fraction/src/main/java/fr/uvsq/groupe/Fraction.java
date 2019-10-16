package fr.uvsq.groupe;

public final class Fraction {
	
	private int numerateur;
	private int denominateur;
	
	public Fraction(int num){
		numerateur = num;
		denominateur = 1;	
	}
	
	public Fraction(int num, int den) {
		this.numerateur = num;
		this.denominateur = den;
	}

	
	public int getDenominateur() {
		return denominateur;
	}
	
	public int getNumerateur() {
		return numerateur; 
	}
	
	public String toString() {
		return numerateur + "/" + denominateur;
	}
}