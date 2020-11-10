import java.util.Random;
abstract class BankAccount {
	private String memberName;
	private String accountNumber;
	private double accountBalance;
	private double minimumBalance;
	
	public BankAccount(String memberName, double accountBalance, double minimumBalance) {
		this.memberName = memberName;
		this.setAccountBalance(accountBalance);
		this.setMinimumBalance(minimumBalance);
		Random rand = new Random();
		String num ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
				rand.nextInt(10)+ rand.nextInt(10);
	}
	
	public void deposit(double depAmount){
	       if(depAmount > 0)
	           setAccountBalance(getAccountBalance() + depAmount);
	       else
	           System.out.println("Invalid amount........");
	   }
	
	public String getAccNum(){
		return accountNumber;
	}
	
	public double getBalance(){
		return getAccountBalance();
	}
	
	public String getMemberName(){
		return memberName;
	}
	
	public void setMemberName(String name){
		memberName=name;
	}
	
	public double getMinBalance(){
		return getMinimumBalance();
	}
	
	public void setMinBalance(double bal){
		setMinimumBalance(bal);
	}
	
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void display() {
		System.out.printf("Name:%s; Account Number:%s; Balance:%lf ",memberName, accountNumber, getAccountBalance());
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
