
package ec.edu.espe.lab_10.utils;
import java.io.*;

/**
 *
 * @author Bryan Zurita
 */
public class FileMethod {
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
            printWriter.write(txt);
            printWriter.close();
            bufferedWriter.close();
        }catch(Throwable e){
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
        }catch(Throwable e){
            System.out.println("El Archivo ha tenido fallos, no se ha logrado leer.....");
        }
        return text;
    }
    
    public void updateFile(String fileName, String compareText, String newText){
        
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String temp ="", bufferedRead, finalPart;
            while((bufferedRead = bufferedReader.readLine()) != null){
                temp += bufferedRead;
                if(bufferedRead.contains(compareText)){
                    File newFile = new File(fileName);
                    FileWriter fileWriter = new FileWriter(newFile);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    PrintWriter printWriter = new PrintWriter(bufferedWriter);
                    printWriter.write(newText+bufferedRead);
                    printWriter.close();
                    bufferedWriter.close();
                }
                else{
                    System.out.println("No se encontro conicidencias...");
                    File newFile = new File(fileName);
                    FileWriter fileWriter = new FileWriter(newFile);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    PrintWriter printWriter = new PrintWriter(bufferedWriter);
                    printWriter.write(bufferedRead);
                    printWriter.close();
                    bufferedWriter.close();
                }
            }
            bufferedReader.close();
        }catch(Throwable e){
            System.out.println("El Archivo ha tenido fallos, no se ha logrado Modificar.....");
        }
    }
    
    public void deleteFile(String fileName){
        File file = new File(fileName);
        if(file.delete()){
            System.out.println("El Archivo se ha eliminado con exito......");
        }
        else{
            System.out.println("El Archivo ha tenido fallos, no se ha logrado eliminarlo.....");
        }
    } 
}