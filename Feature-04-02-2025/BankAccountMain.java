class BankAccountMain{
	public static void main(String[]args){
		BankAccount acc = new BankAccount("Bhagyodaya",2115000284);
		BankAccount acc1 = new BankAccount("Ayush",2115000285);
		
		acc.displayDetails(acc);
		acc1.displayDetails(acc1);
		
		System.out.println("Total Number of Bank Accounts are: "+BankAccount.getTotalAccounts());
	}
}
class BankAccount{
	private static String bankName = "SBI";
	private static int totalAccounts = 0;
	private String accountHolderName;
	private final int accountNumber;
	BankAccount(String accountHolderName, int accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAccounts++;
	}
	public static int getTotalAccounts(){
		return totalAccounts;
	}
	public void displayDetails(BankAccount account){
		if(account instanceof BankAccount){
			System.out.println("Bank Name: "+bankName);
			System.out.println("Account Holder Name: "+accountHolderName);
			System.out.println("Account Number: "+accountNumber);
		}
	}
}