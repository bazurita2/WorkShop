/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.interfaces.model;

import ec.edu.espe.lab_15.interfaces.Animal;

/**
 *
 * @author bryan
 */
public class Mammal implements Animal{

    @Override
    public void feed() {
        System.out.println("Alimentando a un mamifero con leche");
    }

    @Override
    public void assignHabitat() {
        System.out.println("Se le asigno una jaula a el animal");
    }
    
}
