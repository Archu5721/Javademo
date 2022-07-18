
public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
	
	static {
		System.out.println("I am a Block, I execute when the class is loading");
	}
}
