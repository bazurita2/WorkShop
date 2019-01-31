
package exceptions;

import ec.edu.espe.model.CustomException;
import ec.edu.espe.model.User;
import java.util.Scanner;

/**
 * @author bryan
 */
public class Homework15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        User user=new User();
        System.out.println("To use this program you have to register");
        try{
                System.out.println("Please enter your user: ");
                String userName;
                userName=sc.next();
                user.setUserName(userName);
                user.validateUser();
                    
                    
                System.out.println("\n");
                System.out.println("Please enter your password: ");
                String pass;
                pass=sc.next();
                user.setPassword(pass);
                System.out.println("\n");

                System.out.println("Please enter your password again: ");
                String rpass;
                rpass=sc.next();
                user.setRpassword(rpass);
                System.out.println("\n");
                user.validatePassword();
                
        }
        catch(CustomException ex)
        {
            System.out.println("The register is impossible because: \n"+ex.getMessage());
        }

        

        
                
    }
    
}
