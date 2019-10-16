package fr.uvsq.groupe;

public final class Fraction {
	private int denominateur;
	private int numerateur;
	
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
