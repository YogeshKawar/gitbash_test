package Logical_Program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any no. for which you want its factorial:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
//		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factoria of " +num+ "! is: "+fact);
		sc.close();
	}


}
