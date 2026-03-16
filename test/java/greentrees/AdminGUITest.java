package greentrees;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

//Unit test cases for AdminGUI class


public class AdminGUITest {

    @Test
    public void testCreateVolunteer() {
        GreenTreesApp.volunteer.clear();
        Volunteer v = new Volunteer("John", 10, "123", "Dublin", "085");
        GreenTreesApp.volunteer.add(v);
        assertEquals(1, GreenTreesApp.volunteer.size());
        assertEquals("John", GreenTreesApp.volunteer.get(0).getName());
    }

    @Test
    public void testDeleteVolunteer() {
        GreenTreesApp.volunteer.clear();
        Volunteer v = new Volunteer("Mary", 20, "pass", "Cork", "086");
        GreenTreesApp.volunteer.add(v);
        int id = 20;
        for(int i = 0; i < GreenTreesApp.volunteer.size(); i++) {
            if(GreenTreesApp.volunteer.get(i).getUserID() == id) {
                GreenTreesApp.volunteer.remove(i);
                break;
            }
        }
        assertEquals(0, GreenTreesApp.volunteer.size());
    }

    @Test
    public void testAdminLogPush() {
        GreenTreesApp.adminLogs.emptyStack();
        GreenTreesApp.adminLogs.push("User created: John");
        assertEquals(1, GreenTreesApp.adminLogs.size());
    }

    @Test
    public void testAdminLogPop() {
        GreenTreesApp.adminLogs.emptyStack();
        GreenTreesApp.adminLogs.push("User created: John");
        Object log = GreenTreesApp.adminLogs.pop();
        assertNotNull(log);
        assertEquals(0, GreenTreesApp.adminLogs.size());
    }
}