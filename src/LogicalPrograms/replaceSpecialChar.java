package LogicalPrograms;

import java.util.Scanner;

public class replaceSpecialChar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter name: ");
	String name = sc.next();
	String actName=name.replace("@", "");
	System.out.println("Actual Name: "+actName);
	sc.close();
}
}
