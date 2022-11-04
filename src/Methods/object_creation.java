package Methods;

public class object_creation {
public static void main(String[] args) {
	
	object_creation obj1= new object_creation();
	
	obj1.m1();
	obj1.m2();
	obj1.m3();
}
public void m1() {
System.out.println("I am from non static method m1");
}
public void m2() {
System.out.println("I am from non static method m2");
}
public void m3() {
System.out.println("I am from non static method m3");
}
}
//Calling non_static method using object within same class.
