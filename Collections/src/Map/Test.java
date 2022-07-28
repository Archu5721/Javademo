package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	static Map<Integer , String> map;
	public static void main(String[] args) {
		map = new HashMap<Integer , String>();
		map.put(1, "Aakash");
		map.put(2, "Balaji");
		map.put(3, "Chithra");
		System.out.println(map);
		
		System.out.println("Roll No 3 is : " + map.get(3));
//		System.out.println("Roll no of Aakash is : " + map.get("Aakash"));
		System.out.println(authenticate(1,"Aakash"));
		
		System.out.println(" ");
		System.out.println("Keys");
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println(" ");
		System.out.println("VALUES:");
		Collection<String> values = map.values();
		System.out.println(values);
		
		for (Integer key : keys) {
			System.out.println("Key : " + key + " Value : " + map.get(key));
		}
	}		
	static boolean authenticate(Integer UserId , String UserName) {
			return map.get(UserId).equals(UserName);
		
	}
}
