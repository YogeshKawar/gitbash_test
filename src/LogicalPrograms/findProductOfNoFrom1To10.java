package LogicalPrograms;

import java.util.Scanner;

public class findProductOfNoFrom1To10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no: ");
	int num=sc.nextInt();
	int prod=1;
	for(int i=1;i<=num;i++) {
		prod=prod*i;
	}
	System.out.println(prod);
	sc.close();
}
}
