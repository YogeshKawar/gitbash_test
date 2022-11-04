package collection;

import java.util.Vector;

public class Vectors {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("Yogesh");
	v.add('A');
	v.add(100);
	v.add(null);
	v.add(null);
	v.add("yogesh");
	v.add(100);
	v.add("Bhushan");
	System.out.println(v.size());
	System.out.println(v.capacity());
	System.out.println(v.isEmpty());
	System.out.println(v.contains(200));
	System.out.println(v.get(0));
	v.add(0,"Akash");
	System.out.println(v);
	v.remove(0);
	System.out.println(v);
	v.set(1, 'B');
	System.out.println(v);
	System.out.println(v.iterator());
	
}
}
