package greentrees;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

//Unit test cases for LogsGUI class

public class LogsGUITest {

    @Test
    public void testPushLog() {
        GreenTreesApp.adminLogs.emptyStack();
        GreenTreesApp.adminLogs.push("User created: John");
        assertEquals(1, GreenTreesApp.adminLogs.size());
    }

    @Test
    public void testPopLog() {
        GreenTreesApp.adminLogs.emptyStack();
        GreenTreesApp.adminLogs.push("User deleted: Mary");
        Object log = GreenTreesApp.adminLogs.pop();
        assertEquals("User deleted: Mary", log);
        assertEquals(0, GreenTreesApp.adminLogs.size());
    }

    @Test
    public void testDisplayStack() {
        GreenTreesApp.adminLogs.emptyStack();
        GreenTreesApp.adminLogs.push("Tree planted for Alex");
        GreenTreesApp.adminLogs.push("User searched: John");
        String logs = GreenTreesApp.adminLogs.displayStack();
        assertTrue(logs.contains("Tree planted"));
        assertTrue(logs.contains("User searched"));
    }

    @Test
    public void testEmptyStack() {
        GreenTreesApp.adminLogs.push("Test Log");
        GreenTreesApp.adminLogs.emptyStack();
        assertTrue(GreenTreesApp.adminLogs.isEmpty());
    }
}