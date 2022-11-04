package superKey;

public class sample2 extends sample1 {
int a = 50;
public void test(){
	int a = 20;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
}
