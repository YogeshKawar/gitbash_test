package Super_Keyword;

public class SubClass extends Super {
int a=50;
public void accessSuperVar() {
	int a=20; 
	
	System.out.println("Global Variable from Super class "+super.a);
	System.out.println("Global Variable from Same Class "+this.a);
	System.out.println("Local Variable from method "+a);

}
}
