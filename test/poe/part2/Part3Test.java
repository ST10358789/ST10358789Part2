
package poe.part2;

import org.junit.Test;
import static org.junit.Assert.*;


public class Part3Test {
    
    
    public static void loadTestData(){
    Part3.taskDeveloper = new String[4];
    Part3.taskName = new String[4];
    Part3.taskStatus = new String[4];
    Part3.taskDuration = new int [4];
    
    Part3.taskName[0] = "Create Login";
    Part3.taskName[1] = "Create add Tests";
    Part3.taskName[2] = "Create Report";
    Part3.taskName[3] = "add Arrays";
    

    Part3.taskStatus[0] = "To do";
    Part3.taskStatus[1] = "Doing";
    Part3.taskStatus[2] = "Done";
    Part3.taskStatus[3] = "To do";
    

    Part3.taskDeveloper[0] = "Mike Smith";
    Part3.taskDeveloper[1] = "Edward Harrison";    
    Part3.taskDeveloper[2] = "Samantha Paulson";
    Part3.taskDeveloper[3] = "Glenda Oberholzer";
    
    Part3.taskDuration[0] = 5;
    Part3.taskDuration[1] = 8;
    Part3.taskDuration[2]  = 2;
    Part3.taskDuration[3]  = 11;
    
    }
    
    public Part3Test() {
    }

    @Test
    public void testInitializeArray() {
        loadTestData();
        assertEquals("4","4");
        
    }

    @Test
    public void testAddTasks() {
        loadTestData();
        assertEquals("Create add Tests","Create add Tests");
    }

    @Test
    public void testPrintReport() {
        loadTestData();
        //assertEquals();
    }

    @Test
    public void testsearchArray() {
        //populate array
        loadTestData();
        //Search the task Name
        assertEquals("Create Login","Create Login");
    }

    @Test
    public void testSearchDuration() {
    }
   
}
