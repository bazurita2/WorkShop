/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.animal.model;

/**
 *
 * @author bryan
 */
public class Animal {
    public String eyes;
    public static int barnNumber = 7;

    public int getBarnNumber() {
        return barnNumber;
    }
    
    public void assignBarnNumber(int bN){
        barnNumber=bN;
    }
    
    public void feed(){
        System.out.println("The animal is eating");
    }
}
