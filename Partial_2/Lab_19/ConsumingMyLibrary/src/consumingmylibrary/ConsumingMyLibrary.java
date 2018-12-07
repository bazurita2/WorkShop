
package consumingmylibrary;

import ec.edu.espe.libraries.area.Figure;
import ec.edu.espe.libraries.area.Triangle;
import ec.edu.espe.libraries.operations.BasicOperation;
/**
 *
 * @author bryan
 */
public class ConsumingMyLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figure figure = new Triangle(1,2);
        
        float localArea;
        localArea = figure.computeArea();
        
        System.out.println("the area of the triangle is equals to -> "+figure.getArea());
        
        BasicOperation basicOperation = new BasicOperation(1.2F,1.4F);
        
        float localAdd;
        localAdd = basicOperation.add();
        
        System.out.println("the add is equals to -> "+basicOperation.getResult());
        
        float localSubtract;
        localSubtract = basicOperation.subtract();
        
        System.out.println("the subtract is equals to -> "+localSubtract);
        
        float localMultiply;
        localMultiply = basicOperation.multiply();
        
        System.out.println("the multiply is equals to -> "+localMultiply);
        
        float localDivide;
        localDivide = basicOperation.divide();
        
        System.out.println("the divide is equals to -> "+localDivide);
    }
    
    
}
