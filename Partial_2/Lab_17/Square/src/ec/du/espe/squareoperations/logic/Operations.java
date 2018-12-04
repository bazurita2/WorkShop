
package ec.du.espe.squareoperations.logic;

/**
 *
 * @author bryan
 */
public class Operations {
    private float side;
    private float result;
    
    public float calculatePerimeter(float side){
        result = side*4;
        return result;
    }
    
    public float calculateArea(float side){
        result = side*side;
        return result;
    }
}
