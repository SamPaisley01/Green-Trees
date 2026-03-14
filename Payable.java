package greentrees;
public interface Payable {

    double makePayment(double amount);
    
    double getBalance();
    
    double getTotalDonated();
    
}