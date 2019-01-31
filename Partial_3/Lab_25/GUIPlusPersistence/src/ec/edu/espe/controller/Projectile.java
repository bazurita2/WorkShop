
package ec.edu.espe.controller;

import ec.edu.espe.utils.FilePrj;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Projectile {
    
    private double angle;
    private float inicialVelocity;
    private float gravity =9.8f;
    private double x;
    private int ID;
    
    
    public void calculateDistance()
    {
        this.angle=this.angle*2;
        double b = Math.toRadians(this.angle);
        this.x=(double)((this.inicialVelocity*this.inicialVelocity)*Math.sin(b)/this.gravity);
    }
    
    
     public int computeNumberTicket()
    {
       ArrayList<String> lastTicket = new ArrayList<String>();
        int ticket=0;
        FilePrj file= new FilePrj();
        String fileName="Ticket.txt";
        file.exists(fileName);
        lastTicket=file.readTicket(fileName);
        String text;
        text=lastTicket.get(0).toString();
        text.replaceAll(" ", "");
        text.replaceAll("\n","");
        ticket=Integer.parseInt(text);
        ticket++;
        
        file.modify(text,  String.valueOf(ticket), fileName);
        
        return ticket;
       
    }
     
     public String converts()
     {
         String text;
         this.ID=this.computeNumberTicket();
         text=this.ID+";"+this.inicialVelocity+";"+this.gravity+";"+this.angle+";"+this.x+";";
         return text;
     }
     
     public void savetoFile()
     {
        String text=this.converts();
        FilePrj file= new FilePrj();
        file.save("Projectile.csv", text);
        
     }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setInicialVelocity(float inicialVelocity) {
        this.inicialVelocity = inicialVelocity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAngle() {
        return angle;
    }

    public float getInicialVelocity() {
        return inicialVelocity;
    }

    public float getGravity() {
        return gravity;
    }

    public double getX() {
        return x;
    }

    public int getID() {
        return ID;
    }
    
    
}
