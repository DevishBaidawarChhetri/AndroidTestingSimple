package np.com.devish.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MyTest {
    @Test
    public void sumTwoNo(){
        ArithmeticClass arithmeticClass = new ArithmeticClass();
        float expected = 6;
        float actual = arithmeticClass.add(2,4);
        assertEquals(expected, actual);
    }
    @Test
    public void subTwoNo(){
        ArithmeticClass arithmeticClass = new ArithmeticClass();
        float expected = 2;
        float actual = arithmeticClass.subtract(6,4);
        assertEquals(expected, actual);
    }
    @Test
    public void divTwoNo(){
        ArithmeticClass arithmeticClass = new ArithmeticClass();
        float expected = 4;
        float actual = arithmeticClass.divide(16,4);
        assertEquals(expected, actual);
    }
}
