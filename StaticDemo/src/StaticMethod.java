
public class StaticMethod {
	static void method() {
		System.out.println("I am a static method ");
	}
	static {
		System.out.println("I am a static block");
		StaticMethod.method();
	}
	public static void main(String[] args) {
		System.out.println("Inside the main");
		StaticMethod.method();
	}
}
