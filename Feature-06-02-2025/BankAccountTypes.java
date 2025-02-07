class BankAccountTypes{
	public static void main(String[]args){
		SavingAccount savingAccount = new SavingAccount(1000105,1000.0,10.5);
		savingAccount.displayAccountType();
		CheckingAccount checkingAccount = new CheckingAccount(1000106,2000.0,10000);
		checkingAccount.displayAccountType();
		FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(1000108,3000.0,15000);
		fixedDepositAccount.displayAccountType();
	}
}
class BankAccount{
	private int accountNumber;
	private double balance;
	BankAccount(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void displayAccountType(){
		System.out.println("General Bank Account");
	}
}
class SavingAccount extends BankAccount{
	private double interestRate;
	SavingAccount(int accountNumber, double balance, double interestRate){
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	public void displayAccountType(){
		System.out.println("Saving Account");
	}
}
class CheckingAccount extends BankAccount{
	private int withdrawalLimit;
	CheckingAccount(int accountNumber, double balance,int withdrawalLimit){
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	public void displayAccountType(){
		System.out.println("Checking Account");
	}
}
class FixedDepositAccount extends BankAccount{
	private int fdAmt;
	FixedDepositAccount(int accountNumber, double balance,int fdAmt){
		super(accountNumber, balance);
		this.fdAmt = fdAmt;
	}
	public void displayAccountType(){
		System.out.println("Fixed Deposit Account");
	}
}