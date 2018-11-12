
package ec.edu.espe.lab_9.model;
import java.util.*;

/**
 *
 * @author Bryan Zurita
 */
public class Person {
    private String name;
    private int dayBirthDate;
    private int monthBirthDate;
    private int yearBirthDate;

    public Person(String name, int dayBirthDate, int monthBirthDate, int yearBirthDate) {
        this.name = name;
        this.dayBirthDate = dayBirthDate;
        this.monthBirthDate = monthBirthDate;
        this.yearBirthDate = yearBirthDate;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayBirthDate() {
        return dayBirthDate;
    }

    public void setDayBirthDate(int dayBirthDate) {
        if(dayBirthDate > 30 || dayBirthDate < 1){
            System.out.println("Ingreso de dia incorrecto, ingrese otro");
            this.dayBirthDate = 0;
        }
        else{
            this.dayBirthDate = dayBirthDate;
        }
    }

    public int getMonthBirthDate() {
        return monthBirthDate;
    }

    public void setMonthBirthDate(int monthBirthDate) {
        if(monthBirthDate > 12 || monthBirthDate < 1){
            System.out.println("Ingreso de mes incorrecto, ingrese otro");
            this.monthBirthDate = 0;
        }
        else{
            this.monthBirthDate = monthBirthDate;
        }
    }

    public int getYearBirthDate() {
        return yearBirthDate;
    }

    public void setYearBirthDate(int yearBirthDate) {
        if( 2018 < yearBirthDate){
            System.out.println("Ingreso de dia incorrecto, ingrese otro");
            this.yearBirthDate = 0;
        }
        else{
            this.yearBirthDate = yearBirthDate;
        }
    }
    
    public int getDayActual(){
        Calendar now = Calendar.getInstance();
        int dayCalendar = now.get(Calendar.DAY_OF_MONTH);
        return dayCalendar;
    }
    public int getMonthActual(){
        Calendar now = Calendar.getInstance();
        int monthCalendar = now.get(Calendar.MONTH);
        return monthCalendar;
    }
    public int getYearActual(){
        Calendar now = Calendar.getInstance();
        int yearCalendar = now.get(Calendar.YEAR);
        return yearCalendar;
    }
    public String calculateAge(String namePerson){
        int dayAge, monthAge, yearAge;
        String text, name, age, stringYearAge, stringMonthAge, stringDayAge, separateStringYearAge, separateStringMonthAge, separateStringDayAge;
        if(getMonthActual() > dayBirthDate){
           yearAge = getYearActual() - yearBirthDate;
           dayAge = (30 - dayBirthDate) - getDayActual();
           if(dayBirthDate > getDayActual()){
               monthAge = getMonthActual() - monthBirthDate - 1;
           }
           else{
               monthAge = getMonthActual() - monthBirthDate;
           }
        }
        else{
            yearAge = getYearActual() - yearBirthDate - 1;
            dayAge = (30 - dayBirthDate) + getDayActual();
            if(dayBirthDate >= getDayActual()){
               monthAge = getMonthActual() - monthBirthDate - 1;
           }
           else{
               monthAge = getMonthActual() - monthBirthDate;
           }
        }
        if (monthAge < 0){
            monthAge += 12;
        }
        name=/*"Nombre: "+*/namePerson;
        stringYearAge=Integer.toString(yearAge);
        stringMonthAge=Integer.toString(monthAge);
        stringDayAge=Integer.toString(dayAge);
        separateStringYearAge=";"+stringYearAge;
        separateStringMonthAge=";"+stringMonthAge;
        separateStringDayAge=";"+stringDayAge;
        age=separateStringYearAge+separateStringMonthAge+separateStringDayAge;
        text=name+age+" \n";
        return text;
    }
}