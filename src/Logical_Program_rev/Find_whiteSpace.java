package Logical_Program_rev;

import java.util.Scanner;

public class Find_whiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.println("WhiteSpaces are:"+count);
		sc.close();
	}

}
