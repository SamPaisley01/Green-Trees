package greentrees;
public class Admin extends Person {

    private String adminPass;

    public Admin(String name, int userID, String password) {
        super(name, userID, password);
        this.adminPass = adminPass;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }
}