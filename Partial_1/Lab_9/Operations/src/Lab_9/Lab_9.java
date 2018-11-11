
package Lab_9;

import ec.edu.espe.lab_9.model.*;
import ec.edu.espe.lab_10.utils.*;
import java.io.*;
import java.util.*;



/**
 *
 * @author Bryan Zurita
 */
public class Lab_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String name, text, compareText, newText;
        int option, num1, num2, day, month, year, age;
        do{
        System.out.println("\n\t\t*****Menu de opciones*****");
        System.out.println("\t1.Calculadora de operaciones basicas solo con sumas");
        System.out.println("\t2.Calcular edad segun fecha de nacimiento");
        System.out.println("\t3.Crear un archivo con edades");
        System.out.println("\t4.Leer el archivo creado");
        System.out.println("\t0.Salir\n");
        System.out.print("\tIngrese una opcion: ");
        Scanner readOption = new Scanner(System.in);
        option = readOption.nextInt();
        switch (option){
            case 1:
                Scanner readOperacion = new Scanner(System.in);
                System.out.print("\n\tIngrese un numero n1: ");
                num1 = readOperacion.nextInt();
                System.out.print("\tIngrese un numero n2: ");
                num2 = readOperacion.nextInt();
                Operations operacion = new Operations();
                operacion.setOperand1(num1);
                operacion.setOperand2(num2);
                System.out.println("\n\tLa suma es: "+operacion.add(num1,num2));
                System.out.println("\n\tLa resta es: "+operacion.substract(num1,num2));
                System.out.println("\n\tLa multiplicacion es: "+operacion.multiplication(num1,num2));
                System.out.println("\n\tLa division es: "+operacion.divide(num1,num2));
                System.in.read();
                break;
            case 2:
                Scanner readPersona = new Scanner(System.in);
                System.out.print("\n\tIngrese su nombre: ");
                name = readPersona.next();
                System.out.print("\tIngrese el dia de su nacimiento: ");
                day = readPersona.nextInt();
                System.out.print("\tIngrese el mes de su nacimiento: ");
                month = readPersona.nextInt();
                System.out.print("\tIngrese el año de su nacimiento: ");
                year = readPersona.nextInt();
                Person person = new Person ();
                person.setName(name);
                person.setDayBirthDate(day);
                person.setMonthBirthDate(month);
                person.setYearBirthDate(year);
                person.calculateAge(person.getName());
                System.out.println(person.calculateAge(person.getName()));
                System.in.read();
                break;
            case 3:
                Scanner readUser = new Scanner(System.in);
                System.out.print("\n\tIngrese su nombre: ");
                name = readUser.next();
                System.out.print("\tIngrese el dia de su nacimiento: ");
                day = readUser.nextInt();
                System.out.print("\tIngrese el mes de su nacimiento: ");
                month = readUser.nextInt();
                System.out.print("\tIngrese el año de su nacimiento: ");
                year = readUser.nextInt();
                Person user = new Person ();
                user.setName(name);
                user.setDayBirthDate(day);
                user.setMonthBirthDate(month);
                user.setYearBirthDate(year);
                user.calculateAge(user.getName());
                FileMethod methodCreate = new FileMethod();
                methodCreate.createFile("RegistroEdadUsers.csv",user.calculateAge(user.getName()));
                System.in.read();
                break;
            case 4:
                FileMethod methodRead = new FileMethod();
                methodRead.readFile("RegistroEdadUsers.csv");
                System.out.println(methodRead.readFile("RegistroEdadUsers.csv"));
                System.in.read();
                break;
            case 0:
                System.exit(0);
                break;
        }
      }while(option != 0);
    }
    
}
