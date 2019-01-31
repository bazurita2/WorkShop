
package ec.edu.espe.utils;

import ec.edu.espe.control.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bryan
 */
public class FilePrj {
    
    
    public void save(String fileName, String text)
    {
        try
        {
             File file=new File(fileName);
               if (!file.exists()) {
                   file.createNewFile();
                 }
             FileWriter wr=new FileWriter(file.getAbsoluteFile(),true);
             BufferedWriter bw = new BufferedWriter(wr);
             wr.write(text+"\n");
             wr.close();
             bw.close();
        } catch (IOException e)  {
          System.out.println("ERROR: No se pudo escribir en el archivo");
        }
       
    }
    
    
    public ArrayList<Product> readProduct(String fileName) throws IOException{
           ArrayList<Product> products=new ArrayList<>();
            String line= null;
            String text;
            File file = new File (fileName);
            
            int cont=0;
             if(file.exists()){
                 try {
                     BufferedReader read = new BufferedReader(new FileReader(fileName));
                     while((line=read.readLine())!=null)
                     {
                         Product product= new Product();
                         cont++;
                         StringTokenizer mistokens = new StringTokenizer(line, ";");
                         String id= mistokens.nextToken().trim();
                         String name =  mistokens.nextToken().trim();
                         String price =  mistokens.nextToken().trim();
                         String percent =  mistokens.nextToken().trim();
                         String pvp =  mistokens.nextToken().trim();

                         if (cont!=1)
                         {
                         product.setId(Integer.parseInt(id));
                         product.setName(name);
                         product.setPrice(Float.parseFloat(price));
                         product.setPercent(Float.parseFloat(percent));
                         product.setPvp(Float.parseFloat(pvp));
                         
                         products.add(product);
                         }
                         
                    }                 
                    } catch (FileNotFoundException ex) {
                    Logger.getLogger(FilePrj.class.getName()).log(Level.SEVERE, null, ex);

                 }

             }
return products;
    }
    
    
    
    
    
        public String convertsProduct(Product product)
    {
        String text;
        text=product.getId()+";"+product.getName()+";"+product.getPrice()+";"+product.getPercent()+";"+product.getPvp()+";";
        
        return text;
    
    }
    
    
     public void exists(String fileName)
    { 
        File file =new File(fileName);

        if(fileName=="Product.csv" || fileName.equals("Product.csv"))
            {
               if (!file.exists()) {
                  String text;
                  text="ID;Nombre;Precio;Porcentaje;PVP;";
                  this.save(fileName,text);
                  return;
             }
    }
    }
    
}
