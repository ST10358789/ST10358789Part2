
package poe.part2;
import java.util.Arrays;
import javax.swing.JOptionPane; 
import static poe.part2.Menu.Quit;

public class Part3 {
  //GeeksforGeeks.2023.Arrays in Java.[Online].Available at: https://www.geeksforgeeks.org/arrays-in-java/ [Accesssed 01 July 2023]
public static int numTasks;//represents size of all arrays
public static String [] taskDeveloper;
public static String [] taskName;
public static String [] taskStatus;
public static String [] taskID;
public static int [] taskDuration; 


    public static void initializeArray(int Tasks){ //method to initiaalize array
        //TutorialsPoint.2023.How to fill (initialize at once) an Array in Java.[Online].Available at: https://www.tutorialspoint.com/javaexamples/arrays_fill.htm [Accessed 02 July 2023]
    numTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do to you want to create"," Welcome User :)",JOptionPane.INFORMATION_MESSAGE));
    taskDeveloper = new String[numTasks];
    taskName = new String[numTasks];
    taskStatus = new String[numTasks];
    taskDuration = new int[numTasks];
    taskID = new String[numTasks];
    }

    public static void addTasks() { //method to populate arrays
       //SoftwareTestingHelp.2023.Java String Array - Tutorial with code examples.[Online].Available at: https://www.softwaretestinghelp.com/java-string-array/[Accessed 06 July 2023]
        for (int index = 0; index < taskDuration.length; index++) {
            taskName[index] = JOptionPane.showInputDialog(null, "Enter a task name " + (index + 1) + " of " + taskDuration.length) + " : ";           
            taskDeveloper[index] = JOptionPane.showInputDialog(null, "Enter your First name + Last name " + (index + 1) + " of " + taskDuration.length + " : ");
            taskStatus[index]= JOptionPane.showInputDialog(null, "Enter a Task Status "+ " of " + (index+1) + " from the options \n1. Doing \n 2.Done \n 3. To do"); 
                 
            taskDuration[index] = Integer.parseInt(JOptionPane.showInputDialog(null, "How long will the task take? " + (index + 1) + " of " + taskDuration.length + " : "));
        }
        newMenu();
    }
    
    public static void printReport(){
    if (taskName == null){JOptionPane.showMessageDialog(null, "No Developers have been added yet.");
    newMenu();}
    // string to store the output
    else {
    String output = "\n\n";
    //iterate the student
    for (int index=0;index<taskName.length;index++){
        output += "Task Name : " + taskName[index];
        output += "\nTask Status : "+taskStatus[index];
        //output += "\nTask ID : "+ TaskID[index];
        output += "\nDeveloper details : "+ taskDeveloper[index];
        output += "\nTask Duration : "+taskDuration[index] + "hrs";
        output += "\n*********************************\n";
        
    }  
    JOptionPane.showMessageDialog(null, output); 
    //return back to the main menu
    }
    newMenu();
    }
  
    public static String searchArray(){ //method to search for an element in an array
       //GeeksforGeeks.2023.Check if value is present in an Array.[Online].Available at: https://www.geeksforgeeks.org/check-if-a-value-is-present-in-an-array-in-java/ [Accessed 05 July 2023]
    boolean search = false;
    if (taskDeveloper !=null){
            String searchtask = JOptionPane.showInputDialog(null, "Enter the Developer name you want to search for");
        for (int index =0; index<taskDeveloper.length;index++){
            if (taskDeveloper[index].equalsIgnoreCase(searchtask)){
                searchtask = taskDeveloper[index] + " : " +taskName[index] + " : " + taskStatus[index];
                search = true;
                JOptionPane.showMessageDialog(null, searchtask);
                }
        }
    if(search==false)
                JOptionPane.showMessageDialog(null, "No Developer by name of "+taskDeveloper+" was found");//return "Course not found";//default response should the developer details not be found
        }
    else//show error message that no developer details have been added to the array
        {
            JOptionPane.showMessageDialog(null, "No Tasks by Developers have been added yet. Please add tasks ");
        }
    //after searching for Developer, go back to the show menu method in the Menu class.
        newMenu();
    return null;
    }

    public static String[] deleteInfo(String[] array,int index){
        //GeeksforGeeks.2023.Remove an Element at Specific Index from an Array in Java.[Online].Available at: https://www.geeksforgeeks.org/remove-an-element-at-specific-index-from-an-array-in-java/ [Accessed 05 July]
        //if the array is empty or the index is out of range 
        if (array == null || index<0 || index>= taskDeveloper.length){
            //return the original array that was passed to the method
        return array;}
        //creating an array with an element size of -1
        String [] newTaskDeveloper = new String [taskDeveloper.length -1];
        for (int x=0, y=0;index<taskDeveloper.length;index++){
            if (x==index){
                continue;
            }
            newTaskDeveloper[y++]= array[index];
        }
        return newTaskDeveloper;
        
    }
        
        
        
   /* String[] taskDeveloper1 = Part3.taskDeveloper; //taskDeveloper[];
    delete  = JOptionPane.showInputDialog(null,"Enter a task you want to delete");
    int deleted = -1;
    for ( int index = 0; index<taskDeveloper.length;index++){
        if (taskDeveloper[index].equalsIgnoreCase(Delete)){
            deleted = index;
         break;
        }
        else{
            taskDeveloper[deleted] = taskDeveloper[index-1];
        }}
        }*/
    
    
    public static void longestDuration(){
    
    int highestduration= 0;
    //set the first number of hours entered to be the highest
    int duration=taskDuration[0];
    //iterate through the duration array checkking for the longest hours
    for (int index=1; index<taskDuration.length;index++){
        if(taskDuration[index]>highestduration){
        highestduration = taskDuration[index];
        highestduration = index;}
        
    }           
    JOptionPane.showMessageDialog(null, Arrays.toString(taskName) + taskDeveloper[highestduration]+" : " + taskDuration[highestduration]);
    }


public static void newMenu() {
        //string to show menu
        String menu = "\n\nSelect a menu below :";
        menu += "\n1. Create/Add tasks ";
        menu += "\n2. Search Report";
        menu += "\n3. Print full report";
        menu += "\n4. Delete";
        menu += "\n5. Quit Application";
        
        //show menu to user to chose 1,2,3 or 4 
        int answer = Integer.parseInt(JOptionPane.showInputDialog( null, menu,"Welcome User", JOptionPane.INFORMATION_MESSAGE));
         switch (answer) {
             case 1:
             
                initializeArray(Part3.numTasks);
                // call menu to create/add the tasks
                addTasks();
            
                 break;

             case 2:
                 searchArray();
                 
                 break;
             case 3:
                 printReport();
                 
                 break;
             case 4:
                 deleteInfo(taskDeveloper,1);
                 break;
             case 5:
                 Menu.Quit();
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Incorrect option, please select a number from the menu");
                 break;
         }// go back to the main menu
        // showMenu();
     }        


}