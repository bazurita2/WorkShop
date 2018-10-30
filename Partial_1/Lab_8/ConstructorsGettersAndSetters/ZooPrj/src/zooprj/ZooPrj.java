/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprj;

import ec.edu.epe.zooprj.model.Product;

/**
 *
 * @author Bryan Zurita
 */
public class ZooPrj {

    /**
     * @param args the command line arguments
     */
    private static String name="Bryan";
    
    public static void main(String[] args) { 
        System.out.println("Hi my name is "+name);
        System.out.println("");
        Product product = new Product("Shampoo",10,6);
        product.showData();
    }
    
}
