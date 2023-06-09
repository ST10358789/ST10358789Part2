package poe.part2;

import javax.swing.JOptionPane;

public class Tasks {

    public static boolean checkTaskDescription(String taskdescription) {
        boolean tskdescription;
        if (taskdescription.length() <= 50) {
            tskdescription = true;
            JOptionPane.showMessageDialog(null, "Task successfully captured");
            return true;
        } else {
            tskdescription = false;
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
             Menu.showMenu();
        }
        return false;
    }
    static int duration = TaskUtil.duration;
    
}   

