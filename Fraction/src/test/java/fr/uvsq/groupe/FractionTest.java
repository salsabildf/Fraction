package fr.uvsq.groupe;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {

	@Test
	public void constructeur_denominateur_par_defaut() {
		Fraction f = new Fraction(5);
		assertEquals (5, f.getNum());
		assertEquals (1, f.getDen());
	}

}
