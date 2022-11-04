package array;

public class a {
public static void main(String[] args) {
	int ar[]= new int[4];
	ar[0]=10;
	ar[1]=20;
	ar[2]=30;
	ar[3]=40;
	System.out.println(ar[0]);
	System.out.println(ar);//if we try to print gives address
	for (int j=0;j<=3;j++) {
		System.out.println(ar[j]);
	}
}
}
