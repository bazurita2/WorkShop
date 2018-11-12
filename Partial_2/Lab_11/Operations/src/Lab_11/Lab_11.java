
package Lab_11;

import ec.edu.espe.lab_9.model.*;
import ec.edu.espe.lab_10.utils.*;
import java.io.*;
import java.util.*;



/**
 *
 * @author Bryan Zurita
 */
public class Lab_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String name="";
        int option=10, day=0, month=0, year=0;
        do{
        System.out.println("\n\t\t*****Menu de opciones*****");
        System.out.println("\t1.Calcular edad segun fecha de nacimiento");
        System.out.println("\t2.Crear un archivo con edades");
        System.out.println("\t3.Leer el archivo creado");
        System.out.println("\t0.Salir\n");
        System.out.print("\tIngrese una opcion: ");
        Scanner readOption = new Scanner(System.in);
        option = readOption.nextInt();
        switch (option){
            case 1:
                Scanner readPersona = new Scanner(System.in);
                System.out.print("\n\tIngrese su nombre: ");
                name = readPersona.next();
                System.out.print("\tIngrese el dia de su nacimiento: ");
                day = readPersona.nextInt();
                System.out.print("\tIngrese el mes de su nacimiento: ");
                month = readPersona.nextInt();
                System.out.print("\tIngrese el año de su nacimiento: ");
                year = readPersona.nextInt();
                Person person = new Person(name,day,month,year);
                System.out.println(person.calculateAge(person.getName()));
                System.in.read();
                break;
            case 2:
                String txt="";
                Scanner readUser = new Scanner(System.in);
                FileMethod methodCreate = new FileMethod();
                Person user[] = new Person[10];
                for(int i=0;i<user.length;i++){
                    System.out.print("\n\tIngrese su nombre: ");
                    name = readUser.next();
                    System.out.print("\tIngrese el dia de su nacimiento: ");
                    day = readUser.nextInt();
                    System.out.print("\tIngrese el mes de su nacimiento: ");
                    month = readUser.nextInt();
                    System.out.print("\tIngrese el año de su nacimiento: ");
                    year = readUser.nextInt();
                    user[i] = new Person(name,day,month,year);
                    txt += user[i].calculateAge(user[i].getName());
                    methodCreate.createFile("RegistroEdadUsers.csv",txt);
                }
                System.in.read();
                break;
            case 3:
                FileMethod methodRead = new FileMethod();
                methodRead.readFile("RegistroEdadUsers.csv");
                String text = methodRead.readFile("RegistroEdadUsers.csv");
                String[] usersText = text.split(" ");
                for(int i=0;i<usersText.length;i++){
                    System.out.println(usersText[i]);
                }
                System.in.read();
                break;
            case 0:
                System.exit(0);
                break;
        }
      }while(option != 0);
    }
    
}
