package bankaccount;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i=0, sign=0;
        BankAccount account[]= new BankAccount[10];
        
        while(true){
            System.out.println("Create a New Account, Please press    : 1");
            System.out.println("Deposit Money, Please press           : 2");
            System.out.println("Withdraw Money, Please press          : 3");
            System.out.println("Display Account Details, Please press : 4");
            System.out.println("Display all account, Please press     : 5");
            System.out.println("Exit from Application, Please press   : 0");
            System.out.println(" Thank You! ");
            
            
            System.out.println("Please Press your option...... ");
            int option = input.nextInt();
            switch(option){
                case 1:{
                    System.out.println("Create your new Account.....");
                    System.out.println("Please enter Your Name: ");
                    
                    String name= input.nextLine();
                    System.out.printf("Please enter Your ID: ");
                    String id=input.nextLine();
                    System.out.printf("Enter Your Balance: ");
                    double balance=input.nextDouble();
                    account[i++]=new BankAccount(name,id,balance);
                }
                        
                case 2:{
                System.out.printf("Enter Your Id: ");
                String id=input.nextLine();
                for(int j=0;j<i;j++){
                    if(account[j].id == id){
                        System.out.printf("Please enter Deposit money: ");
                        double amount= input.nextDouble();
                        account[j].deposit(amount);  
                        sign=1;
                        break;
                    }
                    else  sign=0;
                }
                    if(sign==0) System.out.println("Account No: "+id+ " not exist. To Create New Account Enter 1");
                }
                        
                case 3:{
                System.out.println("Please enter Your Id: ");
                String id=input.nextLine();
                for(int j=0;j<i;j++){
                    if(account[j].id==id){
                        System.out.println("Please enter Withdraw Amount: ");
                        double amount= input.nextDouble();
                        account[j].deposit(amount); sign=1; break;
                    }
                    else sign=0;
                }
                if( sign==0) System.out.println("Account No: "+id+ " not exist. To Create New Account Enter 1");
            }
                    
                case 4:{
                System.out.println("Enter Your Id: ");
                String id=input.nextLine();
                for(int j=0;j<i;j++){
                    if(account[j].id==id){
                        account[j].display(); sign=1; break;
                    }
                    else sign=0;
                }
                if(sign==0) System.out.println("Account No: "+id+ " not exist. To Create New Account Enter 1");
            }       
                
                case 5: {
                for(int j=0;j<i;j++){
                        account[j].display();
                        System.out.println("");
                }
            }
                
                case 0:
                    System.exit(0);
            }
        }
        
    }
}
