package Logical_Program;

import java.util.Arrays;

public class compare2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {10,20,30,40,50};
		int arr3[]= {40,40,30,20,10};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr2, arr3));
		System.out.println(Arrays.equals(arr1, arr3));
	}

}
