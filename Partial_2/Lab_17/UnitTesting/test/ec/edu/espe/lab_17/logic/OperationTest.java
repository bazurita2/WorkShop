
package ec.edu.espe.lab_17.logic;

import junit.framework.Assert;
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
public class OperationTest {
    
    public OperationTest() {
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
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        short addend1 = 0;
        short addend2 = 0;
        Operation instance = new Operation();
        short expResult = 0;
        short result = instance.add(addend1, addend2);
        System.out.println(expResult+" result");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testAddSimpleCases(){
        short operand1 = 1;
        short operand2 = 2;
        short expectedResolve = 3;
        Operation operation = new Operation();
        short actualResolve = operation.add(operand1, operand2);
        
        assertEquals(expectedResolve, actualResolve);
        System.out.println(operand1+" + "+operand2+" succeeded");
        operand1 = 2;
        operand2 = -1;
        expectedResolve = 1;
        actualResolve = operation.add(operand1, operand2);
        System.out.println(operand1+" + "+operand2+" succeeded");
        System.out.println(expectedResolve+" expected");
        System.out.println(actualResolve+" result");
        assertEquals(expectedResolve, actualResolve);
    }
    
    @Test
    public void testWrongCases(){
        short operand1 = (short) 50000;
        short operand2 = (short) 50000;
        short expectedResolve = 3;
        Operation operation = new Operation();
        short actualResolve = operation.add(operand1, operand2);
        System.out.println(operand1+" + "+operand2+" succeeded");
        System.out.println(expectedResolve+" expected");
        System.out.println(actualResolve+" result");
        assertEquals(expectedResolve, actualResolve);
    }
    
    @Test
    public void testAddCaracter(){
        short operand1 = '1';
        short operand2 = '2';
        short expectedResolve = 3;
        Operation operation = new Operation();
        short actualResolve = operation.add((short)operand1,(short)operand2);
        System.out.println(operand1+" + "+operand2+" succeeded");
        System.out.println(expectedResolve+" expected");
        System.out.println(actualResolve+" result");
        assertEquals(expectedResolve, actualResolve);
        
    }
}
