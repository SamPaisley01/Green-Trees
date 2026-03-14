package greentrees;

import java.util.ArrayList;

public class GreenTreesApp {
    //Declaring ArrayLists
    public static ArrayList<Admin> admin = new ArrayList<>();
    public static ArrayList<Volunteer> volunteer = new ArrayList<>();
    public static ArrayList<Tree> trees = new ArrayList<>();
    
    public static TreeQueue treeQueue = new TreeQueue();
    
    public static void main(String[] args) {
        //populating Arrays
        
        //admin
        admin.add(new Admin("Admin",1,"admin123"));
        
        //volunteers
        volunteer.add(new Volunteer("Joe",101,"pass123","5 Parklane drive","0895003231"));
        
        //trees
        trees.add(new Tree(1,"Oak",10));
        trees.add(new Tree(2,"Birch",15));
        trees.add(new Tree(3,"Cherry Blossom",25));
        trees.add(new Tree(4,"Acacia",20));
        
        //launching login form
        new LoginFormGUI().setVisible(true);
    }
}