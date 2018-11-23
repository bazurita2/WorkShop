/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptions;

import ec.edu.espe.animal.model.Animal;
import ec.edu.espe.operations.utils.Operation;
import java.io.IOException;

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
        //animal = new Animal();
        /*
        if(animal != null){
            System.out.println("The animal exists");
        }else{
            System.out.println("The animal doesn't exist");
        }
        */
        try{
            System.out.println("The first line running");
            System.out.println(animal.eyes);
            System.out.println("The program is still running");
        }catch(NullPointerException ex){
            /*
            System.out.println("An error occurred "+ex);
            System.out.println("The exception is "+ex.getMessage());
            System.out.println(ex.toString());
            if(ex.toString().equals("java.lang.NullPointerException")){
                System.out.println("There are no animal created");
            }
            */
            animal = new Animal();
            if (animal == null){
                System.out.println(animal.eyes);
            }else{
                animal.eyes = "brown";
                System.out.println("The eyes of the horse is "+animal.eyes);
            }
            
        }finally{
            System.out.println("After the exception");
        }
        System.out.println("This is the barn number "+animal.getBarnNumber());
        Animal animal2 = new Animal();
        System.out.println(animal2.getBarnNumber());
        animal.assignBarnNumber(18);
        System.out.println(animal2.getBarnNumber());
    }
    
}
