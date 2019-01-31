
package ec.edu.espe.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
    
    
    
    public boolean searchString(String fileName, String request)
    {

        File file =new File(fileName);
          if (!file.exists()) {
              return false;
              }
      try {    
          BufferedReader rd = new BufferedReader(new FileReader(fileName));
          String line = "";
          
          while((line = rd.readLine())!= null){
              if(line.indexOf(request)!= -1){
                   rd.close();
                    return true;
                 } 
        
            }
             rd.close();
        }catch (Exception e) {
             e.printStackTrace();  }
            return false;
    }
    
    
        public ArrayList<String> readTicket(String fileName)
        {

            File file =new File(fileName);
            FileReader fileread;
            BufferedReader buffer;
            ArrayList<String> text = new ArrayList<String>();
               if (!file.exists()) {
                  System.out.println("ERROR: El archivo no existe");
                  return text;
                  }
            try {
               fileread = new FileReader(file);
               buffer = new BufferedReader(fileread);
               String lines;
             while((lines=buffer.readLine())!=null) {
                   text.add(lines);
                   }
             fileread.close();
            } catch (IOException e) {
               System.out.println("ERROR: No se pudo abrir el archivoo");
           }
        return text;
        }
        
     public void exists(String fileName)
    { 
        File file =new File(fileName);
        if(fileName=="Ticket.txt" || fileName.equals("Ticket.txt"))
            {
               if (!file.exists()) {
                  this.save(fileName,"0");
                  return;
             }
            }
    }
     
     
        public void modify(String oldText, String newText ,String name)
    {
         try
            {
                    BufferedReader a = new BufferedReader(new FileReader(name));
                    String line;
                    String input = "";
                    while ((line = a.readLine()) != null) 
                    {
                        input = input + line + "\n";
                    }

                    input=input.replace(oldText,newText);
                    FileOutputStream getText = new FileOutputStream(name);
                    getText.write(input.getBytes());
                    a.close();
                    getText.close();

            }
            catch (IOException e)
            {
               System.out.println("Un error a ocurrido, inténtelo más tarde");
            }

    }
    
    
}
