package greentrees;

public class Volunteer extends Person implements Payable {

    private String address;
    private String phoneNumber;
    private int totalTreesPlanted;
    private double balance; 
    private double totalDonated; 
    
    public Volunteer(String name, int userID, String password, String address, String phoneNumber) {
        super(name, userID, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.totalTreesPlanted = 0;
        this.balance = 0.0;
        this.totalDonated = 0.0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalTreesPlanted() {
        return totalTreesPlanted;
    }

    public void setTotalTreesPlanted(int totalTreesPlanted) {
        this.totalTreesPlanted = totalTreesPlanted;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTotalDonated() {
        return totalDonated;
    }

    public void setTotalDonated(double totalDonated) {
        this.totalDonated = totalDonated;
    }

    @Override
    public double makePayment(double amount) {
        return 0.0;
    }
}
