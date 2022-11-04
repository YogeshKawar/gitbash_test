package Logical_Program;

import java.util.Scanner;

public class ReplaceSpecial_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name with Special Character");
		String name=sc.next();
		String actname=name.replace("@","");	
		System.out.println("Actual name is:"+actname);
		System.out.println("Enter name with Special Character");
		String name1=sc.next();
		String actname1=name1.replaceAll("[^a-zA-Z0-9]","");	
		System.out.println("Actual name is:"+actname1);
		
		sc.close();
		
	
	}
}
