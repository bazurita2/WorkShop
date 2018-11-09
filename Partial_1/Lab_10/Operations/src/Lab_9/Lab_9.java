
package Lab_9;

import ec.edu.espe.lab_9.model.Operations;
import ec.edu.espe.lab_9.model.Person;
import java.io.File;
import java.io.IOException;
import java.util.*;



/**
 *
 * @author Bryan Zurita
 */
public class Lab_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int num1, num2, day, month, year, age;
        Scanner readOperacion = new Scanner(System.in);
        System.out.println("Ingrese un numero n1: ");
        num1 = readOperacion.nextInt();
        System.out.println("Ingrese un numero n2: ");
        num2 = readOperacion.nextInt();
        Operations operacion = new Operations();
        operacion.setOperand1(num1);
        operacion.setOperand2(num2);
        System.out.println("La suma es: "+operacion.add(num1,num2));
        System.out.println("La resta es: "+operacion.substract(num1,num2));
        System.out.println("La multiplicacion es: "+operacion.multiplication(num1,num2));
        System.out.println("La division es: "+operacion.divide(num1,num2));
        Scanner readPersona = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        name = readPersona.next();
        System.out.println("Ingrese el dia de su nacimiento: ");
        day = readPersona.nextInt();
        System.out.println("Ingrese el mes de su nacimiento: ");
        month = readPersona.nextInt();
        System.out.println("Ingrese el año de su nacimiento: ");
        year = readPersona.nextInt();
        Person person = new Person ();
        person.setName(name);
        person.setDayBirthDate(day);
        person.setMonthBirthDate(month);
        person.setYearBirthDate(year);
        age=person.calculateAge();
        System.out.println("Su edad es: "+String.valueOf(age));
        File file = new File ("Person_Age.txt");
        if (file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+"Ha sido creado");
                System.out.println("El nombre de la persona es: "+person.getName());
                System.out.println("Naciste el dia de: "+person.getDayBirthDate());
                
            }catch (IOException ex){}
        }
    }
    
}
