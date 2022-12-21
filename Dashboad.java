package ATM_Machine;

public class Dashboad {
    public static void main(String args[]){
        Account adi = new Account("87897799","Aditya",0.0,"aditya@gmail.com","9923732984");
        adi.DepositMoney(100.0);
        adi.Withdraw(20.0);
    }
}
