package Logical_Program_rev;

import java.util.Scanner;

public class ReplaceSpacialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String newName=str.replace("@","");
		System.out.println("New Replace String is:"+newName);
		sc.close();
	}

}
