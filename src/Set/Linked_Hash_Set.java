package Set;
 import java.util.LinkedHashSet;
public class Linked_Hash_Set {
public static void main(String[] args) {
	LinkedHashSet lhs= new LinkedHashSet();
	lhs.add("Rainbow");
	lhs.add('A');
	lhs.add(null);
	lhs.add(null);
	lhs.add(100);
	System.out.println(lhs.size());
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.contains("Rainbow"));
	System.out.println(lhs);
}
}
