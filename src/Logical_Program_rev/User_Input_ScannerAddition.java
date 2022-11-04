package Logical_Program_rev;

import java.util.Scanner;

public class User_Input_ScannerAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st No.");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd No.");
		int num2=sc.nextInt();
		System.out.println("Addition is:"+(num1+num2));
		sc.close();
	}

}
