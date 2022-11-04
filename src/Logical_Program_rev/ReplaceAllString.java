package Logical_Program_rev;

import java.util.Scanner;

public class ReplaceAllString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String newName=str.replaceAll("[^A-Za-z0-9]","");
		System.out.println("New String is:"+newName);
		sc.close();
	}

}
