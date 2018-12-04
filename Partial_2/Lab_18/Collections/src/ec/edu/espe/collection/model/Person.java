
package ec.edu.espe.collection.model;

/**
 *
 * @author bryan
 */
public class Person {
    private int id;
    private String name;
    private float salary;
    

    public Person(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        String person;
        person=("id: "+id+" name: "+name+" salary: "+salary);
        return person;
    }
    
}
