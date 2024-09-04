package tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComplexTest {

    @Test
    void minus() {
        Complex b = new Complex(2,1);
        Complex c = new Complex(1,1);
        Complex d = b.minus(c);

        Assertions.assertEquals(d.getRe(), b.getRe());
        Assertions.assertEquals(d.getIm(), b.getIm());
    }
}