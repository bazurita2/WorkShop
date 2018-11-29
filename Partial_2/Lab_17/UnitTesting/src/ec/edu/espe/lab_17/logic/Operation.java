
package ec.edu.espe.lab_17.logic;

/**
 *
 * @author bryan
 */
public class Operation {
    private short operand1;
    private short operand2;
    private short result;
    
    public short add(short addend1, short addend2){
        result = (short) (addend1 + addend2);
        return result;
    }
}
