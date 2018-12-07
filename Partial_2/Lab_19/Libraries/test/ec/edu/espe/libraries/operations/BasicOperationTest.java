
package ec.edu.espe.libraries.operations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bryan
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd1() {
        System.out.println("1st Add");
        BasicOperation instance = new BasicOperation(0.0F,0.1F);
        float expResult = 3.0F;
        float result = instance.add();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd2() {
        System.out.println("2nd Add");
        BasicOperation instance = new BasicOperation(0.000F,0.000F);
        float expResult = 0.000F;
        float result = instance.add();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd3() {
        System.out.println("3th Add");
        BasicOperation instance = new BasicOperation(10000000000000.00000000F,5000000000000.00000000F);
        float expResult = 15000000000000.00000000F;
        float result = instance.add();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd4() {
        System.out.println("4th Add");
        BasicOperation instance = new BasicOperation((float)'2',(float)'4');
        float expResult = 6.0F;
        float result = instance.add();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd5() {
        System.out.println("5th Add");
        BasicOperation instance = new BasicOperation((float)'a',(float)'b');
        String expResult = "a+b";
        float result = instance.add();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract1() {
        System.out.println("1st Subtract");
        BasicOperation instance = new BasicOperation(0.0F,0.1F);
        float expResult = 0.0F;
        float result = instance.subtract();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("2nd Subtract");
        BasicOperation instance = new BasicOperation(0.000F,0.000F);
        float expResult = 0.000F;
        float result = instance.subtract();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract3() {
        System.out.println("3th Subtract");
        BasicOperation instance = new BasicOperation(10000000000000.00000000F,5000000000000.00000000F);
        float expResult = 5.E12F;
        float result = instance.subtract();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract4() {
        System.out.println("4th Subtract");
        BasicOperation instance = new BasicOperation((float)'2',(float)'4');
        float expResult = -2.0F;
        float result = instance.subtract();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtract5() {
        System.out.println("5th Subtract");
        BasicOperation instance = new BasicOperation((float)'a',(float)'b');
        String expResult = "a-b";
        float result = instance.subtract();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply1() {
        System.out.println("1st Multiply");
        BasicOperation instance = new BasicOperation(0.0F,0.1F);
        float expResult = 0.0F;
        float result = instance.multiply();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMultiply2() {
        System.out.println("2nd Multiply");
        BasicOperation instance = new BasicOperation(0.000F,0.000F);
        float expResult = 0.000F;
        float result = instance.multiply();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMultiply3() {
        System.out.println("3th Multiply");
        BasicOperation instance = new BasicOperation(10000000000000.00000000F,5000000000000.00000000F);
        float expResult = 5.E25F;
        float result = instance.multiply();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMultiply4() {
        System.out.println("4th Multiply");
        BasicOperation instance = new BasicOperation((float)'2',(float)'4');
        float expResult = 8.0F;
        float result = instance.multiply();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMultiply5() {
        System.out.println("5th Multiply");
        BasicOperation instance = new BasicOperation((float)'a',(float)'b');
        String expResult = "ab";
        float result = instance.multiply();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide1() {
        System.out.println("1st Divide");
        BasicOperation instance = new BasicOperation(0.0F,0.1F);
        float expResult = 0.0F;
        float result = instance.divide();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivide2() {
        System.out.println("2nd Divide");
        BasicOperation instance = new BasicOperation(0.000F,0.000F);
        float expResult = 0.0F;
        float result = instance.divide();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivide3() {
        System.out.println("3th Divide");
        BasicOperation instance = new BasicOperation(10000000000000.00000000F,5000000000000.00000000F);
        float expResult = 2.00000000F;
        float result = instance.divide();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivide4() {
        System.out.println("4th Divide");
        BasicOperation instance = new BasicOperation((float)'2',(float)'4');
        float expResult = 0.5F;
        float result = instance.divide();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivide5() {
        System.out.println("5th Divide");
        BasicOperation instance = new BasicOperation((float)'a',(float)'b');
        String expResult = "a/b";
        float result = instance.divide();
        System.out.println("result expected -> "+expResult);
        System.out.println("result actual -> "+result);
        assertEquals(expResult, result, 0.0);
    }
    
}
