package Logical_Program;

import java.util.Scanner;

public class Accept_InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st No.");
		int x=sc.nextInt();
		System.out.println("Enter 2nd No.");
		int y=sc.nextInt();
		int add=x+y;
		System.out.println("Sum is:"+add);
		
		sc.close();
	}

}
