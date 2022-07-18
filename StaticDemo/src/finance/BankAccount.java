package finance;

public class BankAccount {
	String HolderName;
	int accNum;
	int balance;
	static String bankName = "HDFC";
	
	void printInfo() {
		System.out.println("Name :"+ this.HolderName);
		System.out.println("Account Number :" + this.accNum);
		System.out.println("Balance :" + this.balance);
		System.out.println("BankName :" + BankAccount.bankName );
		System.out.println("-*-*-*-*-*-*-*-*-*-");
	}
}
