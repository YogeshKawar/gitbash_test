package Logical_Program_rev;

import java.util.Scanner;

public class Mul1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. for which you want multiplication");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul=mul*i;
		}
		System.out.println("MULTIPLICATIO IS:"+mul);
		sc.close();
	}
	
}
