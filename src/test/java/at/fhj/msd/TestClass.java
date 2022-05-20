package at.fhj.msd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestClass {

    private Calculator c;
    double result;

    private Logging l;
    @BeforeEach
    public void setUp(){
        c = new Calculator();
        l = new Logging();
    }

    @Test
    public void testAdd(){
        Assertions.assertEquals(8, c.add(5,3));
        l.debugMessage("5, 3");
    }
    @Test
    public void testAdd1(){
        Assertions.assertEquals(8,result = 5 + 3);
        l.debugMessage("5, 3");
    }
    @Test
    public void testMinus(){
        Assertions.assertEquals(2,c.minus(4,2));
        l.debugMessage("4, 2");
    }
    @Test
    public void testMinus1(){
        Assertions.assertEquals(2,result = 4 - 2);
        l.debugMessage("4, 2");
    }
    @Test
    public void testMultiply(){
        Assertions.assertEquals(16,c.multiply(4,4));
        l.debugMessage("4, 4");
    }
    @Test
    public void testMultiply1(){
        Assertions.assertEquals(16, result = 4 * 4);
        l.debugMessage("4, 4");
    }
    @Test
    public void testDivide(){
        Assertions.assertEquals(2, c.divide(8,4));
        l.debugMessage("8, 4");
    }
    @Test
    public void testDivide1(){
        Assertions.assertEquals(2, result = 8 / 4);
        l.debugMessage("8, 4");
    }
    @Test
    public void testFak(){
        Assertions.assertEquals(0,c.fak(-3));
        l.debugMessage("-3");
    }
    @Test
    public void testFak1(){
        Assertions.assertEquals(6,c.fak(3));
        l.debugMessage("3");
    }
    @Test
    public void testFak2(){
        Assertions.assertEquals(24,c.fak(4));
        l.debugMessage("4");
    }

    @Test
    public void testDivide2(){
        Assertions.assertThrows(ArithmeticException.class, () ->c.divide(3, 0));
    }
}
