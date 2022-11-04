package LogicalPrograms;

public class reverseNumber {
public static void main(String[] args) {
	int num = 1221;
	int revNum =0;
	for(int i=num;i>0;i=i/10) {
		int rem=i%10;
		revNum=revNum*10+rem;
	}
	System.out.println(revNum);
	if(num==revNum) {
		System.out.println("Is palindrome");
	}
	else {
		System.out.println("Is not palindrome");
	}
}
}
