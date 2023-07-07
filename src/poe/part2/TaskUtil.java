package poe.part2;

import javax.swing.JOptionPane;


public class TaskUtil {
  
   public static void searchTaskDetails() {
        boolean found = false;
        if (Tasks.tasksArray != null) {
            // ask user to search for name 
            String search = JOptionPane.showInputDialog("Enter task name to search for : ");
            //itterare through the array to search for matching name
            for (int index = 0; index < Tasks.tasksArray.length; index++) {
                if (search.equals(Tasks.tasksArray[index])) {
                    //print all task info associated with the name
                    Tasks.printTaskDetails1();
                    found = true;
                    break;
                }
                else JOptionPane.showMessageDialog(null, "Please enter a correct name to display");
                Part3.newMenu();
            }
        }
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
            Tasks.status = "To do";
            }
            else if (menuIndex ==1)
            {Tasks.status  = "Done";
            }
            else if (menuIndex == 2)
            {Tasks.status  = "Doing";}      
    }

public static String createTaskID(String taskName, int taskNumber, String developerDetails) {
       
        Tasks.taskID = Tasks.name.substring(0, 2) + ":" + Tasks.size + ":" + Tasks.developerdetails.substring(Tasks.developerdetails.length() - 3);

        return Tasks.taskID;
    }
} 
