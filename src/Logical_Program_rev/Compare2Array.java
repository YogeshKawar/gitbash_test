package Logical_Program_rev;

import java.util.Arrays;

public class Compare2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {10,20,30,40,50};
		int ar2[]= {30,50,60,80,20};
		int ar3[]= {10,20,30,40,50};
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		System.out.println(Arrays.equals(ar2, ar3));
		
		
		Arrays.sort(ar2);
		for(int i=0;i<=ar2.length-1;i++)
		{
			System.out.println(ar2[i]);
		}
	}

}
