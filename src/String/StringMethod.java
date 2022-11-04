package String;

public class StringMethod {
public static void main(String[] args) {
	String s1="asha Akshay Jagtap";
	String s2="ASHA";
	
	String s3="akshay";
	String s4="jagtapakshay";
	
	System.out.println("Reverse String is :"+s1.length());
	
	System.out.println("Uppercase :" +s1.toUpperCase());
	
	System.out.println("Lowecase :" +s2.toLowerCase());
	
	System.out.println("Equality Checking :" +s1.equals(s2));
	
	System.out.println("Equality Checking by ignore case :" +s1.equalsIgnoreCase(s2));
	
	System.out.println("Contains Check :" +s4.contains(s3));
	
	System.out.println("Char At :" +s1.charAt(2));
	
	System.out.println("Index Of :" +s1.indexOf('s') );
	
	System.out.println("Last Index Of :" + s1.lastIndexOf('a'));
	
	System.out.println("Start with :" +s1.startsWith("as"));
	
	System.out.println("End with :" +s1.endsWith("sh"));
	
	System.out.println("SubString :" +s1.substring(1)); 
	
	System.out.println("Concatination :" +s1.concat(s3));
	
	System.out.println("replace :" +s1.replace("asha","Shourya"));
	
}
}

