
package ec.edu.espe.lab_9.model;
import java.util.Calendar;

/**
 *
 * @author Bryan Zurita
 */
public class Person {
    private String name;
    private int dayBirthDate;
    private int monthBirthDate;
    private int yearBirthDate;

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
        if(dayBirthDate > 32 || dayBirthDate < 1){
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
    public int calculateAge(){
        int day, month, year, restDay, restMonth;
        if(getYearActual() < yearBirthDate){
            day = getDayActual() + 30;
            month = getMonthActual() - 1;
            year = getYearActual() - 1;
            restDay = getDayActual() - dayBirthDate;
        }
        else{
            restDay = getDayActual() - dayBirthDate;
        }
        if(getMonthActual() < monthBirthDate){
            month = getMonthActual() + 12;
            year = getYearActual() - 1;
            restMonth = getMonthActual() - monthBirthDate;
        }
        else{
            restMonth = getMonthActual() - monthBirthDate;
        }
        return getYearActual() - yearBirthDate;
    }
}