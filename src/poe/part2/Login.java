
package poe.part2;
import javax.swing.JOptionPane;

public class Login {
    
    static String password,userName;
   
    static Login obj = new Login();
    
    public static boolean checkUserName() {
        
        //Username tips
        //Contains an Undescore
        //Should not be longer than 5 characters
        userName = JOptionPane.showInputDialog(null, "Please enter your user Name ", userName, JOptionPane.QUESTION_MESSAGE);
        String specialChar = "_";
        //to check if username meets requirements
        if (userName.length() <= 5 && userName.contains(specialChar)) {

            JOptionPane.showMessageDialog(null,"Username has been successfully captured");
            return true;
        } //to check if username does not meet requirements 
        else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        }
        return false;
    }
    public static boolean checkPasswordComplexity() {
        password = JOptionPane.showInputDialog(null, "Please enter a password no longer than 8 characters long", password, JOptionPane.QUESTION_MESSAGE);
        //Password requirements
        //At least 8 characters long
        //Contains an special character
        //Contains a capital letter
        //Contains a number
        boolean Lower = false, Upper = false, digit = false, special =false;
        char ch;
        //prompt user to input password
        int total = password.length();
        // conditions of the password
        // geeksforgeeks.2023.Java Program to Check Whether the String Consists of Special Characters.[Source Code].https://www.geeksforgeeks.org/java-program-to-check-whether-the-string-consists-of-special-characters/ (ccessed 26 April 2023)
        
        for (int i = 0; i < total ; i++) 
        {
            ch = password.charAt(i);
            
            if (Character.isUpperCase(ch)){
                Upper = true;
            }
            if (Character.isLowerCase(ch)) {
                Lower = true;
            }
            if (Character.isDigit(ch)) {
                digit = true;
            } 
            if (!Character.isDigit(ch)&& !Character.isAlphabetic(ch))
            {   special = true;}
            
            if (Upper ==true && Lower ==true && digit ==true && special ==true ){
           JOptionPane.showMessageDialog(null, "Password has been captured successfully");
                return true;
            }
            else if  (Upper ==false && Lower ==false&& digit ==false && special ==false ){
            JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter , a number and a special character : ");
        Menu.registerUser();}
        }
            return false;}
    
        

    public static boolean registerUser()    
    { 
        // check if login user details are correct
        if (userName.equals(userName) && password.equals(password)) {
        
        JOptionPane.showMessageDialog(null, "Registration successful");
        }
        else
        {
        JOptionPane.showMessageDialog(null, "“Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }
        Menu.registerUser();
        return false;
    }
    
    //Register login user
    public static boolean loginUser()// Register login user method
    {
        
        // check if login user details are correct
        if (userName.equals(userName) && password.equals(password)) {
            
            JOptionPane.showMessageDialog(null, "Login successful");
            return true;
            }  
            else {
           
            JOptionPane.showMessageDialog(null, "Unsuccessful login");
            } 
        return false;
    }
    
    public static String returnLoginStatus(){
//        Scanner obj = new Scanner(System.in);
//        String firstName;
//        firstName = obj.nextLine();
//        String lastName;
//        lastName = obj.nextLine();
        {
        if (password.equals(password)&& userName.equals(userName))
        {JOptionPane.showMessageDialog(null, "Welcome to easy Kanban" );
        }
        else{
        JOptionPane.showMessageDialog(null, "Username/Password is Ïncorrect. Please register again" );
        }
        return null;
        
    }
    }
}
                
    

