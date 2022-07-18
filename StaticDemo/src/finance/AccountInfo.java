package finance;

public class AccountInfo {
	public static void main(String[] args) {
		//object creation for bankaccount
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		account1.HolderName = "Rishi";
		account1.accNum=1000;
		account1.balance=5000;
		account2.HolderName = "Kani";
		account2.accNum=1001;
		account2.balance=9000;
		
		account1.printInfo();
		account2.printInfo();
	}
	
}
