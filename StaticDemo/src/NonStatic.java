
public class NonStatic {
	static int x=5;
	int val;
	String name;
	{
		System.out.println("I am not a static block");
	}
	NonStatic(int num,String name){
		
		System.out.println("In a constructor");
		this.val=num;
		this.name=name;
	}
	public static void main(String[] args) {
		System.out.println("In main method");
		NonStatic obj= new NonStatic(10,"Mary");
		System.out.println(obj.name);
		System.out.println(obj.val);
		System.out.println(obj.x);
	}
}
