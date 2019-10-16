package fr.uvsq.groupe;

import static org.junit.Assert.*;

<<<<<<< HEAD
import org.junit.Before;
=======
>>>>>>> 8baeee419f8adba5d9d58177e2bb057555180fc0
import org.junit.Test;

public class FractionTest {

<<<<<<< HEAD
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
=======
	@Test
	public void test() {
		fail("Not yet implemented");
>>>>>>> 8baeee419f8adba5d9d58177e2bb057555180fc0
	}

}
