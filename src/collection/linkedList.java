package collection;

import java.util.LinkedList;

public class linkedList {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add("Ankush");
	ll.add('D');
	ll.add("Akash");
	ll.add(100);
	ll.add("Yogesh");
	ll.add(null);
	ll.add(null);
	System.out.println(ll.size());
	System.out.println(ll.get(6));
	System.out.println(ll.get(5));
	System.out.println(ll.isEmpty());
	System.out.println(ll.contains(200));
	System.out.println(ll.get(2));
	ll.add(2, "Bhushan Bagul");
	System.out.println(ll);
	ll.remove(2);
	System.out.println(ll);
	ll.set(0, "BhushanKumar");
	System.out.println(ll);
}
}
