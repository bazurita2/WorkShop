
package ec.edu.espe.interfaces.model;

import ec.edu.espe.lab_15.interfaces.Animal;

/**
 *
 * @author bryan
 */
public class Reptile implements Animal{

    @Override
    public void feed() {
        System.out.println("Alimentando a un reptil con carne");
    }

    @Override
    public void assignHabitat() {
        System.out.println("Se le asigno una jaula a el animal");
    }
    
}
