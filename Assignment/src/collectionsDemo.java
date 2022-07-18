
import java.util.*;
public class collectionsDemo {
	
	public static void main(String[] args) {
		//ArrayList
		System.out.println("ArrayList");
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(50);
		System.out.println(ob);
		System.out.println("");
		System.out.println("LinkedList:");
		LinkedList<String> names =  new LinkedList<String>();
		names.add("Arjun");
		names.add("Aravindh");
		names.add("Bala");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
