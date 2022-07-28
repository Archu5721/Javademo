package collections;

import java.util.ArrayList;
import Set.StringComparator;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Zara");
		list.add("degree");
		list.add("water");
		list.add("colour");
		list.add("dog");
		System.out.println("before : " + list);
		Collections.sort(list);
		System.out.println("After : " +list);
		
		Collections.sort(list,new StringComparator());
		System.out.println("Sort in string length :" + list);
		
		Collections.reverse(list);
		System.out.println("Reverse insertion order : " + list);
		
		Collections.sort(list, new StringReverse());
		System.out.println("Reverse String Length : " + list);
	}
}
