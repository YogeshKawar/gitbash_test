package StringClass;

public class A {
public static void main(String[] args) {
	String s1 = "Velocity";
	String s2 = "VELOCITY";
	String s3 = "I am from";
	System.out.println(s1.length());
	System.out.println(s2.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.contains("Vel"));
	System.out.println(s1.contains("VEL"));
	System.out.println(s1.contains(s2));
	System.out.println(s1.charAt(1));
	System.out.println(s1.indexOf('y'));
	System.out.println(s1.lastIndexOf('t'));
	System.out.println(s1.startsWith("Ve"));
	System.out.println(s2.startsWith("Ve"));
	System.out.println(s1.endsWith("ty"));
	System.out.println(s1.endsWith("cy"));
	System.out.println(s1.substring(5));
	System.out.println(s1.concat(s2));
	System.out.println(s3.concat(s1));
	System.out.println(s1.replace("Velocity", "Yogesh"));
}
}
