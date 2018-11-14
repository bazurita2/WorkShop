
package ec.edu.espe.lab_12.model;

import java.util.Calendar;

/**
 *
 * @author bryan
 */
public class Animal {
    protected int id;
    protected String scientificName;
    protected int arrivalYear;

    public Animal(int id, String scientificName, int arrivalYear) {
        this.id = id;
        this.scientificName = scientificName;
        this.arrivalYear = arrivalYear;
        //this.yearsOfState = computeYearsOfState(arrivalYear);
    }
    
    public int getYearActual(){
        Calendar now = Calendar.getInstance();
        int yearCalendar = now.get(Calendar.YEAR);
        return yearCalendar;
    }
    
    public int computeYearsOfState(int arrivalYear){
        int yearsOfState;
        yearsOfState = getYearActual() - arrivalYear;
        return yearsOfState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public int getArrivalYear() {
        return arrivalYear;
    }

    public void setArrivalYear(int arrivalYear) {
        this.arrivalYear = arrivalYear;
    }
    
    
}
