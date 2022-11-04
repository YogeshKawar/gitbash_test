package Logical_Program;

import java.util.Scanner;

public class Find_WhileSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String:");
     	String str=sc.nextLine();
     	System.out.println(str);
		int cnt=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				cnt++;
			}
		}
	System.out.println("White spaces:"+cnt);
	sc.close();
	}

}
