
package Zoo;

import ec.edu.espe.lab_12.model.*;
import java.util.*;

/**
 *
 * @author bryan
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id=0, arrivalYear=0;
        String textGestation="", textLactation="" ,textNameMammal="", textYearsOfStateMammal="";
        String name="", textMammal="", textReptile="", txt="";
        Scanner readMammal = new Scanner(System.in);
        Scanner readReptile = new Scanner(System.in);
        FileManage methodCreate = new FileManage();
        Mammal mammal[] = new Mammal[1];
        for(int i=0;i<mammal.length;i++){
            System.out.print("\n\tIngrese un nuevo mamifero");
            System.out.print("\n\tIngrese la ID: ");
            id = readMammal.nextInt();
            System.out.print("\tIngrese el nombre: ");
            name = readMammal.next();
            System.out.print("\tIngrese el año de llegada: ");
            arrivalYear = readMammal.nextInt();
            mammal[i] = new Mammal(id,name,arrivalYear,0);
            textNameMammal = ";"+name;
            textYearsOfStateMammal = ";"+Integer.toString(mammal[i].computeYearsOfState(arrivalYear));
            textLactation = ";"+mammal[i].lactationTime();
            textGestation = ";"+mammal[i].computeTimeOfGestation();
            textMammal += id+textNameMammal+textYearsOfStateMammal+textLactation+textGestation+" \n";
        }
        Reptile reptile[] =new Reptile[1];
        String textLayEgg="", textNameReptile="", textYearsOfStateReptile="";
        for(int i=0;i<reptile.length;i++){
            System.out.print("\n\tIngrese un nuevo reptil");
            System.out.print("\n\tIngrese la ID: ");
            id = readReptile.nextInt();
            System.out.print("\tIngrese el nombre: ");
            name = readReptile.next();
            System.out.print("\tIngrese el año de llegada: ");
            arrivalYear = readReptile.nextInt();
            reptile[i] = new Reptile(id,name,arrivalYear);
            textNameReptile = ";"+name;
            textYearsOfStateReptile = ";"+Integer.toString(reptile[i].computeYearsOfState(arrivalYear));
            textLayEgg = ";"+reptile[i].LayEgg();
            textReptile += id+textNameReptile+textYearsOfStateReptile+textLayEgg+" \n";
        }
        txt = textMammal+textReptile;
        methodCreate.createFile("RegistroAnimales.csv",txt);
        FileManage methodRead = new FileManage();
        methodRead.readFile("RegistroEdadUsers.csv");
        System.out.println("\nLa lectura del archivo es la siguiente: \n");
        String text = methodRead.readFile("RegistroAnimales.csv");
        String[] animalsText = text.split(" ");
        for(int i=0;i<animalsText.length;i++){
            System.out.println(animalsText[i]);
        }
    }
    
}
