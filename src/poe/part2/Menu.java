
package poe.part2;

import javax.swing.JOptionPane;


public class Menu {
    static Login obj = new Login();
    
    public static void User(){
    String menu = "\n\nSelect a menu below :";
        menu += "\n1. Register User ";
        menu += "\n2. Login user ";
        menu += "\n3. Quit Application";
    
    int answer = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
    switch (answer){
        //register the user using their userName and Password
        case 1: registerUser();
                break;
        case 2: login();
                break;
        case 3: Quit();
        default : JOptionPane.showMessageDialog(null, "Incorrect option, please select a number from the menu");
                 break;}
         User();        
    }  
    public static void registerUser(){
        //obj.checkUserName();
        //obj.checkPasswordComplexity();
        //obj.returnLoginStatus();
        TaskUtil.addTasks(TaskUtil.size);
    }
    public static void login(){
    
        obj.checkUserName();
        obj.checkPasswordComplexity();
        obj.returnLoginStatus();
        TaskUtil.addTasks(TaskUtil.size);
   
    }
    
     public static void showMenu() {
        //string to show menu
        String menu = "\n\nSelect a menu below :";
        menu += "\n1. Create/Add tasks ";
        menu += "\n2. Show Report";
        menu += "\n3. Quit Application";
        
        //show menu to user to chose 1,2,3 or 4 
        int answer = Integer.parseInt(JOptionPane.showInputDialog( null, menu,"Welcome User", JOptionPane.INFORMATION_MESSAGE));
         switch (answer) {
             case 1:
                //method to store size of tasks
                 TaskUtil.addTasks(TaskUtil.size);
                 break;
             case 2:
                 showReport();
                 break;
             case 3:
                 Quit();
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Incorrect option, please select a number from the menu");
                 break;
         }// go back to the main menu
         showMenu();
     }        
//TheServerSide.2023.Java JOptionPane input example.[Online].Available At:https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-user-input-with-a-Swing-JOptionPane-example [Accessed 15 May 2023]
    

    public static void showReport() {
        JOptionPane.showMessageDialog(null, "Coming Soon");
        showMenu();
    }

    public static void Quit() {
       JOptionPane.showMessageDialog(null, "Thank you for using the application. Goodbye ");    
        System.exit(0);
    }

    
}
