package InterviewProgram;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Value of a:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter Value of b:"); 
		Scanner sc1=new Scanner(System.in);
		int b=sc1.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Replace value store in a:"  +a);
		System.out.println("Replace value store in b:"  +b);
		sc.close();
		sc1.close();
		
	}

}
