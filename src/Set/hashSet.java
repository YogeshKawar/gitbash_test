package Set;

import java.util.HashSet;

public class hashSet {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(100);
	hs.add('A');
	hs.add(null);
	hs.add(null);
	hs.add(100);
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains(100));
	System.out.println(hs.size());
}
}
