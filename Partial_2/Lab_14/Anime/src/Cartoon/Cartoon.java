
package Cartoon;

import ec.edu.espe.lab_14.util.*;

/**
 *
 * @author Bryan Zurita
 */
public class Cartoon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Shonen");
        Shonen anime1 = new Shonen(){};
        Anime anime2 = new DragonBall();
        Anime anime3 = new Naruto();
        anime1.yearOfIssue();
        anime1.caracteristic();
        System.out.println("class -> "+anime2.getClass().getSimpleName());
        anime2.yearOfIssue();
        System.out.println("class -> "+anime3.getClass().getSimpleName());
        anime3.yearOfIssue();
        System.out.println("");
        System.out.println("Gore");
        Gore anime4 = new Gore(){};
        Anime anime5 = new DeathNote();
        Anime anime6 = new Another();
        anime4.yearOfIssue();
        anime4.caracteristic();
        System.out.println("class -> "+anime5.getClass().getSimpleName());
        anime5.yearOfIssue();
        System.out.println("class -> "+anime6.getClass().getSimpleName());
        anime6.yearOfIssue();
    }
    
}
