package poe.part2;

import javax.swing.JOptionPane;


public class Tasks {
    // static variable to stpre size of task objects
    public static int size;
 //static array to store task objects of size array   
    public static Tasks [] tasksArray;
// string to store details for printing    
    static String details = ""; 
    static String taskNum = "";
    static String name, developerdetails, description, status,taskID;
    static int duration;
    static double totalHours;
    
    public static void initializeArray(){
    size = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks you want to create ", "Welcome User",JOptionPane.INFORMATION_MESSAGE ));
    tasksArray = new Tasks[size];
    }


    public static boolean checkTaskDescription(String taskdescription) {
        boolean tskdescription;
        if (taskdescription.length() <= 50) {
            tskdescription = true;
            JOptionPane.showMessageDialog(null, "Task successfully captured");
            return true;
        } else {
            tskdescription = false;
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
             Part3.newMenu();
        }
        return false;
    }
 
    public static void addTasks(Tasks tasks){
      //<code>https://www.geeksforgeeks.org>https://www.geeksforgeeks.org/arrays-in-java/amp/
      //<code>https://www.oreilly.com/library/view/learning-java-4th/9781449372477/ch04s07.html#:~:text=An%20array%20is%20a%20special,all%20primitive%20and%20reference%20types.
       for (int index = 0; index<tasksArray.length;index++){
        
       //Tasks task = new Tasks();
       //method to populate the array
        tasksArray[index].name = JOptionPane.showInputDialog("Enter a task Name for task" +index);
        tasksArray[index].description = JOptionPane.showInputDialog("Enter a task description");
            if (Tasks.checkTaskDescription(description)){    
            String first;
            first = JOptionPane.showInputDialog("Enter the developers first name ");  
            String last;
             last = JOptionPane.showInputDialog("Enter the developers last name "); 
            developerdetails = first + last;  }       
        tasksArray[index].duration = Integer.parseInt(JOptionPane.showInputDialog("Enter the task duration "));  
        tasksArray[index].taskNum = "" + (index+1); 
        TaskUtil.taskStatus();
        TaskUtil.createTaskID(name,size,developerdetails);
        JOptionPane.showMessageDialog(null,printTaskDetails1());
       //tasksArray[index]= task;
       }
       
        JOptionPane.showMessageDialog(null,"The total number of hours is "+ returnTotalHours(duration));
        
  
    }
  
    public static double returnTotalHours(int numHours){
    //elemets already declared in given array
    //<code>https://www.geeksforgeeks.org/how-to-add-an-element-to-an-array-in-java/amp/
       // int sum = 0;
       // for (int i= 0; i<size; i++){
       // sum = sum + Tasks.duration;}
       // return sum;
        totalHours+=duration;
        JOptionPane.showMessageDialog(null,"The total number of hours is "+ returnTotalHours(duration));
        //return totalHours;
        return totalHours;
        }


// method to print all the task + information in the array 
    public static String printTaskDetails1(){
    String Details= "\n*****************";
    for (int i=0;i<tasksArray.length;i++){
        Details = "Task Status : " + tasksArray[i].status;
        Details += "\n Developer Details : "+ tasksArray[i].developerdetails;
        Details += "\n Task Name : " + tasksArray[i].name;
        Details += "\n Task Description : " + tasksArray[i].description;
        Details += "\n Task Duration : " + tasksArray[i].duration + "hrs";
        Details += "\n Task ID : " + tasksArray[i].taskID;
        Details += "\n*********************";
    }
        return Details;
    }
       
}
   
    

       

