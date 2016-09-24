package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(3, 6);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(3, this.fraction.getNumerator());
        assertEquals(6, this.fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        Fraction fraction2 = new Fraction();
        assertEquals(1, fraction2.getNumerator());
        assertEquals(1, fraction2.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.5, this.fraction.decimal(), 10e-5);
    }

    @Test
    public void testReciprocal() {
        Fraction reciprocalFraction = this.fraction.reciprocal();
        assertEquals(6, reciprocalFraction.getNumerator());
        assertEquals(3, reciprocalFraction.getDenominator());
    }
    
    @Test
    public void testMultiplicar() {
        assertEquals(6, this.fraction.multiplicar(2), 10e-5);
    }
}
