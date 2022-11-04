package collection;

import java.util.ArrayList;

public class arrayList {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Yogesh");
	al.add(100);
	al.add(null);
	al.add(100);
	al.add(null);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.contains(100));
	al.add(2, 200);
	System.out.println(al.get(2));
	al.remove(3);
	System.out.println(al);
}
}
