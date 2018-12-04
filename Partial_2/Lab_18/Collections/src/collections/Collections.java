/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import ec.edu.espe.collection.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author bryan
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection thing = new ArrayList();
        Person person = new Person(2,"Bryan",12.0F);
        System.out.println("Size at the beginning "+thing.size());
        thing.add(18000);
        thing.add("Hello quito");
        thing.add(5000.25F);
        thing.add(person.toString());
        System.out.println("Size at the beginning "+thing.size());
        System.out.println("the elements in the list are"+thing);
        
        Object[] thingArray = new Object[thing.size()];
        thingArray=thing.toArray();
        System.out.println("The third elelment is: "+thingArray[2].toString());
        thing.remove(5000.25F);
        System.out.println(thing);
        thing.add(3);
        thing.add(3);
        thing.add(3);
        System.out.println("Size at the beginning "+thing.size());
        System.out.println("the elements in the list are"+thing);
        thing.add(5);
        thing.add(8);
        thing.add(4);
        thing.add(8);
        thing.add(9);
        
        System.out.println("Size at the beginning "+thing.size());
        System.out.println("the elements in the list are"+thing);
        thing.remove(8);
        System.out.println("Size at the beginning "+thing.size());
        System.out.println("the elements in the list are"+thing);
        thing.remove(person.toString());
        System.out.println("Size at the beginning "+thing.size());
        System.out.println("the elements in the list are"+thing);
        
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);        
        
        Collection<Person> persons;
        persons = new ArrayList<>();
        
        for(int i=0;i<5;i++){
            persons.add(new Person(i+1, "Bryan" +(i+1),(i+1)*1000));
        }
        
        /*for(Person p: persons){
            System.out.println("Peron --> "+p);
        }*/
        
        persons.forEach((p) -> {
            System.out.println("Peron --> "+p);
        });
        
}
