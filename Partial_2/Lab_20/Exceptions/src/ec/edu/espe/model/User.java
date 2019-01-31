
package ec.edu.espe.model;

/**
 *
 * @author bryan
 */
public class User {
    private String userName;
    private String password;
    private String rpassword; //Repeat password. 

    public User() {
    }

    public void validateUser()throws CustomException{
        if(getUserName().equals(null))
        {
            throw new CustomException("The user camp is empty, please enter again");
        }
        
        if(getUserName().equals(" "))
        {
            throw new CustomException("The user camp doesn't have letters, please enter again");
        }
    }
    
    public void validatePassword()throws CustomException{
        if(!this.password.equals(this.rpassword))
        {
            throw new CustomException("The passwords don't match, please enter again");
        }
        
        if(this.password.equals(null))
        {
            throw new CustomException("The password is empty, please enter again");
        }
        
        if(this.password.equals(" "))
        {
            throw new CustomException("The password doesn't have letters, please enter again");
        }
        
        if(this.password.length()<6)
        {
            throw new CustomException("The password is too short, please enter again");
        }
        
        if(!(this.password.contains("0")||this.password.contains("1")||this.password.contains("2")||this.password.contains("3")
                ||this.password.contains("4")||this.password.contains("5")||this.password.contains("6")||this.password.contains("7")
                ||this.password.contains("8")||this.password.contains("9")))
        {
            throw new CustomException("The password needs at least one number, please enter again");
        }
        
    }    

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param rpassword the rpassword to set
     */
    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }
}
