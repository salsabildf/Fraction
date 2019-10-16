package fr.uvsq.groupe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Fraction ZERO = new Fraction(0,1);
		Fraction UN   = new Fraction(1,1);
		
		Fraction f = new Fraction(3,5);
		double tmpN = f.getNumerateur();
		double tmpD = f.getDenominateur();
		double resultat = (tmpN / tmpD );
		
		System.out.println(ZERO.toString() );
		System.out.println(resultat);
	}

}
