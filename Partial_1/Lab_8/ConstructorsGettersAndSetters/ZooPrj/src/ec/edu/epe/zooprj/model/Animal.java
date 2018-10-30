
package ec.edu.epe.zooprj.model;

/**
 *
 * @author Bryan Zurita
 */
public class Animal {
    private int id;
    private String name;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
