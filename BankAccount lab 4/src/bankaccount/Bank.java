package bankaccount;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your name..... ");
        String name = input.nextLine();
        System.out.println("Please enter your bank id......");
        String id = input.next();
        System.out.println("Please enter your balance......");
        double balance = input.nextDouble();
        BankAccount account = new BankAccount(name,id,balance);
        
        while(true){
            System.out.println("Please press '1' to deposit, '2' to withdraw, "
                    + "'3' to display and press '0' to exist ");
            int option = input.nextInt();
            switch(option){
                case 1:
                    System.out.println("Please enter how much money you need to deposit.....");
                    double money = input.nextDouble();
                    account.deposit(money);
                    System.out.println("Present money: "+account.money);
                    break;
                    
                case 2:
                    System.out.println("Please enter how much money you need to withdraw.....");
                    double withdraw = input.nextDouble();
                    account.withdraw(withdraw);
                    System.out.println("Present money: "+account.money);
                    break;
                case 3:
                    account.display();
                    break;
                case 0:
                    System.exit(0);
            }
        }
        
    }
}
