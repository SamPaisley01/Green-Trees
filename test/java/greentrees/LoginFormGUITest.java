package greentrees;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

//Unit test cases for LoginFormGUI class

public class LoginFormGUITest {

    @Test
    public void testAdminLoginSuccess() {
        Admin admin = new Admin("Admin", 1, "pass");
        GreenTreesApp.admin.add(admin);
        int userID = 1;
        String password = "pass";
        Person found = null;
        for(Admin a : GreenTreesApp.admin) {
            if(a.getUserID() == userID && a.getPassword().equals(password)) {
                found = a;
            }
        }
        assertNotNull(found);
        assertTrue(found instanceof Admin);
    }

    @Test
    public void testVolunteerLoginSuccess() {
        Volunteer v = new Volunteer("John", 101, "pass123", "Dublin", "085123");
        GreenTreesApp.volunteer.add(v);
        int userID = 101;
        String password = "pass123";
        Person found = null;
        for(Volunteer vol : GreenTreesApp.volunteer) {
            if(vol.getUserID() == userID && vol.getPassword().equals(password)) {
                found = vol;
            }
        }
        assertNotNull(found);
        assertTrue(found instanceof Volunteer);
    }

    @Test
    public void testInvalidLogin() {
        int userID = 999;
        String password = "wrong";
        Person found = null;
        for(Admin a : GreenTreesApp.admin) {
            if(a.getUserID() == userID && a.getPassword().equals(password)) {
                found = a;
            }
        }
        for(Volunteer v : GreenTreesApp.volunteer) {
            if(v.getUserID() == userID && v.getPassword().equals(password)) {
                found = v;
            }
        }
        assertNull(found);
    }
}