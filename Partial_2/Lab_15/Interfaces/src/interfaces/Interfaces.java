
package interfaces;

import ec.edu.espe.interfaces.model.Mammal;
import ec.edu.espe.interfaces.model.Reptile;
import ec.edu.espe.lab_15.interfaces.Animal;

/**
 *
 * @author Bryan Zurita
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        animal = new Mammal();
        animal.feed();
        animal.assignHabitat();
        animal = new Reptile();
        animal.feed();
        animal.assignHabitat();
    }
    
}
