package poe.part2;

import javax.swing.JOptionPane;


public class TaskUtil {
// static variable to stpre size of task objects
    public static int size;
 //static array to store task objects of size array   
    public static Tasks [] tasksArray = new Tasks [100];
// string to store details for printing    
    static String TaskDetails = ""; 
    static String name, developerdetails, taskdescription, status,taskID;
    static int duration;
  
  public static void addTasks(int numTasks){
      //<code>https://www.geeksforgeeks.org>https://www.geeksforgeeks.org/arrays-in-java/amp/
      //<code>https://www.oreilly.com/library/view/learning-java-4th/9781449372477/ch04s07.html#:~:text=An%20array%20is%20a%20special,all%20primitive%20and%20reference%20types.
        size = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks you want to create ", "Welcome User",JOptionPane.INFORMATION_MESSAGE ));
        for (int i =0; i<size ; i++){
        //tasksArray = new Tasks [size]; 
        tasksArray = new Tasks[size];
        Tasks obj = new Tasks();
        name = JOptionPane.showInputDialog("Enter a task Name");
        taskdescription = JOptionPane.showInputDialog("Enter a task description");
            if (Tasks.checkTaskDescription(taskdescription)){    
            String first;
            first = JOptionPane.showInputDialog("Enter the developers first name ");  
            String last;
             last = JOptionPane.showInputDialog("Enter the developers last name "); 
            developerdetails = first + last;  }       
        duration= Integer.parseInt(JOptionPane.showInputDialog("Enter the task duration "));  
        taskStatus();
        tasksArray[i] = obj;
        createTaskID(name,size,developerdetails);
        printAllTaskDetails();}
        returnTotalHours(duration);
    }
   public void searchTaskDetails() {
        boolean found = false;
        if (tasksArray != null) {
            // ask user to search for name 
            String search = JOptionPane.showInputDialog("Enter task name to search for : ");
            //itterare through the array to search for matching name
            for (int index = 0; index < tasksArray.length; index++) {
                if (search.equals(tasksArray[index])) {
                    //print all task info associated with the name
                    printTaskDetails();
                    found = true;
                    break;
                }
                else JOptionPane.showMessageDialog(null, "Please enter a correct name to display");
                Menu.showMenu();
            }
        }
    }
    // method to print all the task + information in the array 
    public static String printTaskDetails() {
       //create string for all the task Details
        TaskDetails = " \n*******************************";
        TaskDetails += "\n Task Status : "+ status ;
        TaskDetails += "\n Developer Details : "+ developerdetails ;
        TaskDetails += "\n Task Number : " + size ;
        TaskDetails += "\n Task Name : " + name;
        TaskDetails += "\n Task Description : " + taskdescription; 
        TaskDetails += "\n Task ID " + taskID; 
        TaskDetails += "\n Task Description : "+ duration + " hrs" ;
        JOptionPane.showMessageDialog(null, TaskDetails);
       return TaskDetails; 
    }
     public static String printAllTaskDetails(){
         //method to rpint all the details from the tasks
        String AllTaskDetails = "";
        AllTaskDetails = " \n*******************************";
        AllTaskDetails += "\n Task Status : "+ status ;
        AllTaskDetails += "\n Developer Details : "+ developerdetails ;
        AllTaskDetails += "\n Task Number : " + size ;
        AllTaskDetails += "\n Task Name : " + name;
        AllTaskDetails += "\n Task Description : " + taskdescription; 
        AllTaskDetails += "\n Task ID " + taskID; 
        AllTaskDetails += "\n Task Description : "+ duration + " hrs" ;       
        JOptionPane.showMessageDialog(null, AllTaskDetails);      
        return "";
     }

      public static int returnTotalHours(int numHours){
    //elemets already declared in given array
    //<code>https://www.geeksforgeeks.org/how-to-add-an-element-to-an-array-in-java/amp/
        double sum = 0;
        for (int i= 0; i<size; i++){
        sum = sum + tasksArray[i].duration;}
        JOptionPane.showMessageDialog(null,"The total number of hours is "+sum);
        return (int)sum;

    }
      public static void taskStatus() {
        Object menu[] = {" To do ", "Done ", "Doing "};
        int menuIndex = JOptionPane.showOptionDialog(
                null,
                "Choose a task status", 
                "Task Status", 
                0, 
                JOptionPane.QUESTION_MESSAGE, 
                null,
                menu,
                1);
            if (menuIndex == 0){
            status = "To do";
            }
            else if (menuIndex ==1)
            {status  = "Done";
            }
            else if (menuIndex == 2)
            {status  = "Doing";}      
    }

public static String createTaskID(String taskName, int taskNumber, String developerDetails) {
       
        taskID = name.substring(0, 2) + ":" + size + ":" + developerdetails.substring(developerdetails.length() - 3);

        return TaskUtil.taskID;
    }
} 
