
package ec.du.espe.squareoperations.logic;

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
public class OperationsTest {
    
    public OperationsTest() {
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
     * Test of calculatePerimeter method, of class Operations.
     */
    @Test
    public void testCalculatePerimeterNegative() {
        System.out.println("1st CalculatePerimeter");
        float side = -6.0F;
        Operations operation = new Operations();
        float expectedResult = 24.0F;
        float actualResult = operation.calculatePerimeter(side);
        System.out.println(side+" * 4 succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult,0.0);
    }
    
    @Test
        public void testCalculatePerimterWrongCasesNegative(){
        System.out.println("2nd CalculatePerimeter");
        Operations operation= new Operations();
        float side = -700000000000000.00000F;
        float expectedResult = -2800000000000000.00000F;
        float actualResult = operation.calculatePerimeter(side);
        System.out.println(side+" * 4 succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult,0.0);
    }
        
    @Test
        public void testCalculatePerimeterWrongCases(){
        System.out.println("3th CalculatePerimeter");
        Operations operation= new Operations();
        float side = 500000000000000000000000000.0F;
        float expectedResult = 2000000000000000000000000000.0F;
        float actualResult = operation.calculatePerimeter(side);
        System.out.println(side+" * 4 succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult,0.0);
        }
        
    @Test
        public void testCalculatePerimeterNormalCases(){
        System.out.println("4th CalculatePerimeter");
        Operations operation= new Operations();
        float side = 2.00000000F;
        float expectedResult = 8.00000000F;
        float actualResult = operation.calculatePerimeter(side);
        System.out.println(side+" * 4 succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult,0.0);
        }
        
    @Test
        public void testCalculatePerimeterCharacterCases(){
        System.out.println("5th CalculatePerimeter");
        Operations operation = new Operations();
        float side = '1';
        float expectedResult = 4.0F;
        float actualResult = operation.calculatePerimeter(side);
        System.out.println(side+" * 4 succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult,0.0);
        }

    /**
     * Test of calculateArea method, of class Operations.
     */
    @Test
    public void testCalculateAreaNegative() {
        System.out.println("1st CalculateArea");
        float side = -6.0F;
        Operations operation = new Operations();
        float expectedResult = 36.0F;
        float result = operation.calculateArea(side);
        System.out.println(side+"*"+side+" succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(result+" actual");
        assertEquals(expectedResult, result, 0.0);
    }
    
    @Test
    public void testCalculateAreaWrongCasesNegative() {
        System.out.println("2nd CalculateArea");
        Operations operation = new Operations();
        float side = -700000000000000.00000F;
        float expectedResult = 4900000000000000.00000F;
        float actualResult = operation.calculateArea(side);
        System.out.println(side+"*"+side+" succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testCalculateAreaWrongCases() {
        System.out.println("3th CalculateArea");
        Operations operation= new Operations();
        float side = 500000000000000000000000000.0F;
        float expectedResult = 2500000000000000000000000000.0F;
        float actualResult = operation.calculateArea(side);
        System.out.println(side+"*"+side+" succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testCalculateAreaNormalCases(){
        System.out.println("4th CalculateArea");
        Operations operation= new Operations();
        float side = 2.00000000F;
        float expectedResult = 4.00000000F;
        float actualResult = operation.calculateArea(side);
        System.out.println(side+"*"+side+" succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testCalculateAreaCharacterCases() {
        System.out.println("5th CalculatePerimeter");
        Operations operation = new Operations();
        float side = '1';
        float expectedResult = 1.0F;
        float actualResult = operation.calculateArea(side);
        System.out.println(side+"*"+side+" succeeded");
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult, 0.0);
    }
}
