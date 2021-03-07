package activity;

        import static org.junit.Assert.*;

        import org.junit.After;
        import org.junit.AfterClass;
        import org.junit.Before;
        import org.junit.BeforeClass;
        import org.junit.Test;

public class CalculatorTests {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        calculator.setA(5);
        calculator.setB(5);
        int result = calculator.addition();

        assertEquals(10, result);
    }
    @Test
    public void testSubstraction() {
        calculator.setA(7);
        calculator.setB(15);
        int result = calculator.substraction();

        assertEquals(8, result);
    }
    @Test
    public void testMultiplication() {
        calculator.setA(2);
        calculator.setB(3);
        int result = calculator.multiplication();

        assertEquals(6, result);
    }
    @Test
    public void testDevision() {
        calculator.setA(6);
        calculator.setB(3);
        double result = calculator.devision();

        assertEquals(2.0, result, 0);
    }
}










//package sef.module17.sample;
//
//        import static org.junit.Assert.*;
//
//        import org.junit.After;
//        import org.junit.AfterClass;
//        import org.junit.Before;
//        import org.junit.BeforeClass;
//        import org.junit.Test;
//
//public class MyCalTest2 {
//    private MyCalculator theCalculator;
//
//    @BeforeClass
//    public static void setUpBeforeClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownAfterClass() throws Exception {
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        theCalculator = new MyCalculator();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
////	@Test
////	public void test() {
////		fail("Not yet implemented");
////	}
//
//    @Test
//    public void testGetSum() {
//
//        int a = 5;
//        int b = 10;
//        //	Checks the sum of two (2) positive values
//        assertEquals(15, (theCalculator.getSum(a,b)));
//        assertEquals(15, (theCalculator.getSum(b,a)));
//
//        a = -5;
//        b = 10;
//        //	Checks the sum of a postive value and a negative value
//        assertEquals(5, (theCalculator.getSum(a,b)));
//        assertEquals(5, (theCalculator.getSum(b,a)));
//
//        a = -5;
//        b = -10;
//        //	Checks the sum of two (2) negative values
//        assertEquals(-15, (theCalculator.getSum(a,b)));
//        assertEquals(-15, (theCalculator.getSum(b,a)));
//    }
//
//}
