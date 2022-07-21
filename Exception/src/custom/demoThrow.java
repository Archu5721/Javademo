package custom;

//import javax.management.RuntimeErrorException;

public class demoThrow {
	public static void main(String[] args) {
		int amount = 1500;
		System.out.println("Amount withdrawing :" + amount);
		try {
			demoThrow obj = new demoThrow();
			obj.withdrawAmount(amount, 4000);
			System.out.println("Amount withdrawn");
		}catch(customException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	void withdrawAmount(int amount,int accountNumber) {
		int balance = getBalance();
		if(balance < amount) {
			throw new customException("Insufficient amount");
		}
	}
	int getBalance() {
		return 1000;
	}
	
}
