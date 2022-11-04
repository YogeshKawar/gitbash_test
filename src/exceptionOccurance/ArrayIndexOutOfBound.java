package exceptionOccurance;

public class ArrayIndexOutOfBound {
public static void main(String[] args) {
	String ar[]=new String[5];
	ar[0]="Pune";
	ar[1]="Nashik";
	ar[2]="Mumbai";
	ar[3]="Nagpur";
	ar[4]="Satara";
	System.out.println(ar[0]);
	System.out.println(ar[5]);//if we try to fetch index which is not present in array this exception occurs
}
}