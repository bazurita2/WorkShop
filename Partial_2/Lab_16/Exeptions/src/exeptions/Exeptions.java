/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptions;

import ec.edu.espe.animal.model.Animal;
import ec.edu.espe.operations.utils.Operation;

/**
 *
 * @author bryan
 */
public class Exeptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation operation;
        operation = new Operation();
        System.out.println(operation.divide(8,5));
        System.out.println(operation.divide(386,897));
        System.out.println(operation.divide((float)5.81,(float)1.31));
        System.out.println(operation.divide(8,0));
        System.out.println(operation.add((short)30000,(short)30000));
        System.out.println(operation.add((float)1.2,(float)2.4));
        System.out.println(operation.add((float)1.2,(float)1.9));
        System.out.println(operation.add(1,(float)1.9));
        Animal animal = null;
        System.out.println(animal.eyes);
    }
    
}
