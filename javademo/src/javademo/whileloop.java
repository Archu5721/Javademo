package javademo;

public class whileloop {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
//		while(i<=7) {
//			System.out.println(i);
//			i++;
//		}
//		
		while(i<=7) {
			sum+=i;
			i++;
		}
		System.out.println("sum :" +sum);
	}
}
