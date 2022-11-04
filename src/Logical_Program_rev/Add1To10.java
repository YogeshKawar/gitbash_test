package Logical_Program_rev;

import java.util.Scanner;

public class Add1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. for which you want addition");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Addition is:"+sum);
		sc.close();
	}

}
