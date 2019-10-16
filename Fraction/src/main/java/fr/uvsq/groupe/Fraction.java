package fr.uvsq.groupe;

<<<<<<< HEAD
public final class Fraction {
	
	private int numerateur;
	private int denominateur;
	
	public Fraction(int num){
		numerateur = num;
		denominateur = 1;	
	}

	public int getNum() {
		return numerateur;
	}

	public int getDen() {
		return denominateur;
	}

=======
>>>>>>> ab493f06db6ce3b1946d54e9cae5fb863ae64edd

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