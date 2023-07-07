
package poe.part2;

import javax.swing.JOptionPane;


public class Menu {
    //static Tasks tasks = new Tasks();
    
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
        Login.checkUserName();
        Login.checkPasswordComplexity();
        Login.returnLoginStatus();
        Tasks task = new Tasks();
        Part3.initializeArray(Part3.numTasks);
        Part3.addTasks();
    }
    public static void login(){
    
        //obj.checkUserName();
       // obj.checkPasswordComplexity();
       // obj.returnLoginStatus();
        //call method to initialize the size of the array
        Part3.newMenu();
        Part3.initializeArray(Part3.numTasks);
        // call menu to create/add the tasks
        Part3.addTasks();
        
        //Tasks.createTasks(Tasks.size);
   
    }
    
//TheServerSide.2023.Java JOptionPane input example.[Online].Available At:https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-user-input-with-a-Swing-JOptionPane-example [Accessed 15 May 2023]
    

    public static void showReport() {
        JOptionPane.showMessageDialog(null, "Task hasn't been added");
        Part3.newMenu();
    }

    public static void Quit() {
       JOptionPane.showMessageDialog(null, "Thank you for using the application. Goodbye ");    
        System.exit(0);
    }

    
}
