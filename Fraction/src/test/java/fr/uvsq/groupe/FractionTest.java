package fr.uvsq.groupe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
  
  private Fraction f ;
	
	@Before
	public void Fraction (){f = new Fraction(100, 4);}
	
	@Test
	public void testNumerateur() {
		assertEquals(100,f.getNumerateur());
	}
	
	@Test
	public void testDenominateur() {
		assertEquals(4,f.getDenominateur());
	}
	
	@Test  (expected = IllegalArgumentException.class)
	public void testDenominateurNegatif()
	{   f =  new Fraction(100,0);
	}

}
