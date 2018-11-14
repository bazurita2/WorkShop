
package ec.edu.espe.lab_12.model;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Mammal extends Animal {
    private int numberOfNipple;

    public Mammal(int id, String scientificName, int arrivalYear, int numberOfNipple) {
        super(id, scientificName, arrivalYear);
    }
    
    public boolean lactationTime(){
        int temp=0;
        boolean lactation=false;
        Scanner readLactation = new Scanner(System.in);
        System.out.print("\n\tEl mamifero esta en periodo de lactancia?\n\tEn caso de si estarlo digite 1, caso contrario digite 0: ");
        temp = readLactation.nextInt();
        if(temp == 1){
            lactation = true; 
        }else{
            lactation = false;
        }
        return lactation;
    }
    public int computeTimeOfGestation(){
        int timeOfGestation=0,size=0;
        Scanner readSize = new Scanner(System.in);
        System.out.print("\n\tIngrese el tamaño en centimetros: ");
        size = readSize.nextInt();
        if(size>0 && size<60){
            timeOfGestation=3;
        }else{
            if(size<210){
                timeOfGestation=9;
            }else{
                timeOfGestation=22;
            }
        }
        return timeOfGestation;
    }
    
}
