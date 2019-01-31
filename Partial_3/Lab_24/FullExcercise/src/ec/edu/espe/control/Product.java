
package ec.edu.espe.control;

import ec.edu.espe.utils.FilePrj;

/**
 *
 * @author bryan
 */
public class Product {
    private int id;
    private String name;
    private float price;
    private float percent;
    private float pvp;
    
    
    public void calculatePvp()
    {
        this.pvp=(float)(this.getPrice()*this.getPercent());
        this.pvp=(float)(this.pvp+this.getPrice());
        
    }
    
    

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getPercent() {
        return percent;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getPvp() {
        return pvp;
    }
    
        public void saveProduct(Product product){
        FilePrj file=new FilePrj();
        String text;
        text=file.convertsProduct(product);
        file.exists("Product.csv");
        file.save("Product.csv", text);
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    
        
        
    
}
