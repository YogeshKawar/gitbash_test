package LogicalPrograms;

import java.util.Scanner;

public class countWhiteSpaces {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String name = sc.nextLine();
	int count=0;
	for(int i=0;i<=name.length()-1;i++) {
		char ch =name.charAt(i);
		if(ch==' ') {
			count++;
		}
	}
	System.out.println(count);
	sc.close();
	
}
}
