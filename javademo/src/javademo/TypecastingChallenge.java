package javademo;

public class TypecastingChallenge {
	public static void main(String[] args) {
		String value = "12";
		int val = Integer.parseInt(value);
		System.out.println(val);
		
		String val1= "1.2345";
		Double d = Double.parseDouble(val1);
		System.out.println(d);
	}
	
	

}
