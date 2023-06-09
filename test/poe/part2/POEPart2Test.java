
package poe.part2;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class POEPart2Test {
    static Tasks tasks = new Tasks();
    
    public POEPart2Test() {
    }

    @Test
    public void testMain() {
    }
    @Test 
    public void testcheckTaskDescription(){
    assertEquals(true,tasks.checkTaskDescription("Create login to authenticate users"));
    }
    @Test 
    public void testcheckTaskDescription_(){
    assertEquals(true,tasks.checkTaskDescription("Create Add Tasks feature to add task users"));
    }
    @Test
    public void testcheckTasDescription(){
    assertEquals(false,tasks.checkTaskDescription("Create a login feature to authenticate users and also Add a Tasks feature to add task users"));    
    } 
    @Test
    public void testaddTasks(){
    //assertEquals(true,tasks.addTasks(2));
    }
}
   // @Test
   // public void test









