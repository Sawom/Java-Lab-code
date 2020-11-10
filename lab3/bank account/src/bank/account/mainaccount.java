package bank.account;
public class mainaccount {
    public static void main(String[] args) {
        BankAccount myaccount = new BankAccount("sawom","19101008",10000);
        myaccount.withdraw(2000);
        myaccount.display();
        System.out.println("after widraw.........");
        myaccount.deposit(2500);
        myaccount.display();
    }
}
