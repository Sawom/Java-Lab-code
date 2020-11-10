package BankAccount;
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
    
    void withdraw(double withAmount){
        if(this.balance<withAmount){
            System.out.println("sorry!not enough balance in your account!");
        }
        else{
            this.balance= this.balance- withAmount;
        }
    }
    
    double getBalance(){
        return this.balance;
    }
    
    public void display(){
        System.out.println(this);
    }
    
    public String toString(){
        return "BankAccount [name ="+name+", id=" +id+", balance="+balance+" ]" ;
    }
}
