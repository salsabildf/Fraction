package fr.uvsq.groupe;

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


}
