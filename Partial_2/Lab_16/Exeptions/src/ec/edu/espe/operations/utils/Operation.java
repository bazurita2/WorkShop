/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.operations.utils;

/**
 *
 * @author bryan
 */
public class Operation {
    
    public float divide(float operand1,float operand2){
        float quotient,result=0;
        quotient = operand1/operand2;
        result = quotient;
        return result;
    }
    
    public short add(short operand1,short operand2){
        short result=0,sum=0;
        sum = (short) (operand1 + operand2);
        result = sum;
        return result;
    }
    public float add(float operand1,float operand2){
        float result=0,sum=0;
        sum = operand1 + operand2;
        result = sum;
        return result;
    }

    public boolean divide(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
