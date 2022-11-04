package starPatterns;

import java.util.Scanner;

public class userInputStarPattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("How many rows you want to print? :");
	int rows = sc.nextInt();
	for (int i=0;i<rows;i++) {
		for(int j=0; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	sc.close();
}
}
