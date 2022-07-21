package exceptionDemo;

public class MultiCatch {
	public static void main(String[] args) {
		try{
			String g = args[0];
			System.out.println("String :"+g);
			int out = Integer.parseInt(g);
			System.out.println("Integer :" + out);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is required!!");
		}catch(NumberFormatException e) {
			System.out.println("Input should be a number.");
		}
		System.out.println("Program ended!!");
		
	}
}
