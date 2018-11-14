
package ec.edu.espe.lab_12.model;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Reptile extends Animal{
    
    public Reptile(int id, String scientificName, int arrivalYear) {
        super(id, scientificName, arrivalYear);
    }
    
    public boolean LayEgg(){
        int temp=0;
        boolean putEgg;
        Scanner readLayEgg = new Scanner(System.in);
        System.out.print("\n\tEl reptil esta en periodo de puesta de huevos?\n\tEn caso de si estarlo digite 1, caso contrario digite 0: ");
        temp = readLayEgg.nextInt();
        if(temp == 1){
            putEgg = true; 
        }else{
            putEgg = false;
        }
        return putEgg;
    }
}