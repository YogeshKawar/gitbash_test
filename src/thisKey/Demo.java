package thisKey;

public class Demo {
int a= 50;//global var
public void test() {
	int a = 60;//local var
	System.out.println(a);
	System.out.println(this.a);
}
}
