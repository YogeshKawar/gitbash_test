package StringToInteger;

import java.util.Scanner;

public class B {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter alphanumeric value: ");
	String str = sc.next();
	str = str.replaceAll("[^0-9]", "");
	int val = Integer.parseUnsignedInt(str);
	System.out.println("Converted Integer Value: "+val);
	sc.close();
}
}
