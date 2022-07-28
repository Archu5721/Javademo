package Set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemoString {
	public static void main(String[] args) {
		Set<String>set = new TreeSet<>();
		set.add("Matt");
		set.add("Johnathan");
		set.add("Kate");
		set.add("Antonie");
		System.out.println(set);
		
		System.out.println("StringComparator");//based on length
		Set<String>myset = new TreeSet<>(new StringComparator());
		myset.add("Matt");
		myset.add("Johnathan");
		myset.add("Kate");
		myset.add("Antonie");
		System.out.println(myset);
	}
}
