package bank.account;
public class BankAccount {
    public String name;
    public String id; 
    public double balance;
    
    public BankAccount(String name,String id,double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }
    
    void deposit(double balance){
        this.balance= this.balance+balance;
    }
    
    void withdraw(double withdraw){
        if(this.balance<withdraw){
            System.out.println("sorry!not enough balance in your account!");
        }
        else{
            this.balance= this.balance- withdraw;
        }
    }
    
    double getBalance(){
        return this.balance;
    }
    
    void display(){
        System.out.println("name = "+this.name);
        System.out.println("id = "+this.id);
        System.out.println("balance = "+this.balance);
    }
    
}
