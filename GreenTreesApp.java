package greentrees;

import java.util.ArrayList;

public class GreenTreesApp {
    public static ArrayList<Admin> admin = new ArrayList<>();
    public static ArrayList<Volunteer> volunteer = new ArrayList<>();
    
    public static void main(String[] args) {
        
        //populating Arrays
        
        //admin
        admin.add(new Admin("Admin",1,"admin123"));
        
        //volunteers
        volunteer.add(new Volunteer("Joe",101,"pass123","5 Parklane drive","0895003231"));
                
        
        new LoginFormGUI().setVisible(true);
    }
}
