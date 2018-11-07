
package ec.edu.espe.lab_9.model;

/**
 *
 * @author  Bryan Zurita
 */
public class Operations {
    private int operand1;
    private int operand2;
    private int result;
    
    
    
    
    public int add(int operand1, int operand2){
        result=operand1+operand2;
        return result;
    }
    
    public int substract(int operand1, int operand2){
        operand2=(operand2*(-1));
        result=operand1+operand2;
        return result;
    }
    public int multiplication(int operand1, int operand2){
        operand2=Math.abs(operand2);
        operand1=Math.abs(operand1);
        int result=0;
        int cont=1;
        while(cont <= operand1){
            result=result+operand2;
            cont++;
        }
        return result;
    }
    public int divide(int operand1, int operand2){
        int aux=(operand2*(-1));
        int result=0;
        if(operand2 == 0) {
            if (operand1 < 0 && operand2 < 0){
                System.out.println("El resultado es infinito positivo");
            }
            else{
                if (operand1 == 0 && operand2 == 0){
                    System.out.println("El resultado es un indeterminacion");
                }
                if (operand1 < 0 || operand2 < 0){
                        System.out.println("El resultado es infinito negativo");
                }
            }
        }
        else{
            while(operand1 >= operand2){
            operand1=operand1+aux;
            result++;
            }
        }
        return result;
    }

    /*public Operation(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }*/

    /**
     * @param operand1 the operand1 to set
     */
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    /**
     * @param operand2 the operand2 to set
     */
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }   
    
}