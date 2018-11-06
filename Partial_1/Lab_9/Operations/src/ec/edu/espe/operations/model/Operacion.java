
package ec.edu.espe.operations.model;

/**
 *
 * @author  Bryan Zurita
 */
public class Operacion {
    private int operand1;
    private int operand2;
    private int result;
    
    
    
    
    public int add(int operand1, int operand2){
        result=operand1+operand2;
        return getResult();
    }
    
    public int substract(int operand1, int operand2){
        operand2=(operand2*(-1));
        result=operand1+operand2;
        return getResult();
    }
    public int multiplication(int operand1, int operand2){
        Math.abs(operand2);
        int cont=1;
        while(cont == operand2){
            result=result+operand1;
            cont++;
        }
        return getResult();
    }
    public int divide(int operand1, int operand2){
        int aux=(operand2*(-1));
        result=0;
        
              if(operand2 == 0) {
                System.out.println("El resultado es infinito");
            }
              if( operand2  < 0 || operand1 < 0){
            System.out.println("El resultado es infinito negativo");
        }else 
            if(operand2 < 0 && operand1 <0){
                System.out.println("El resultado es infinito positivo");
            }
        while(operand1 >= operand2){
            operand1=operand1-aux;
            result++;
        }
        return getResult();
    }

    public Operacion(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

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

    /**
     * @return the result
     */
    public int getResult() {
        return result;
    }
    
    
}