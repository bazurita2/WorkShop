
package ec.edu.espe.lab_12.model;
import java.io.*;

/**
 *
 * @author bryan
 */
public class FileManage {
    public void createFile(String fileName,String txt){
        File file;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        PrintWriter printWriter;
        try{
            file = new File(fileName);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            printWriter.append(txt);
            printWriter.close();
            bufferedWriter.close();
        }catch(IOException e){
            System.out.println("El Archivo ha tenido fallos, no se ha logrado crear.....");
        }
    } 
    
    public String readFile(String fileName){
        String text="";
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String temp ="", bufferedRead;
            while((bufferedRead = bufferedReader.readLine()) != null){
                temp = temp + bufferedRead;
            }
            text = temp;
            bufferedReader.close();
        }catch(IOException e){
            System.out.println("El Archivo ha tenido fallos, no se ha logrado leer.....");
        }
        return text;
    }
}