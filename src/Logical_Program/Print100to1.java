package Logical_Program;

public class Print100to1 {
public static void main(String[] args) {
	int i=100;
	while(i>=1)
	{
		System.out.print(" "+i--);
	}
	
	//using for loop
	
	System.out.println();
	for(int j=100;j>=1;j--)
	{
		System.out.print(" " +j);
	} 
}
}
