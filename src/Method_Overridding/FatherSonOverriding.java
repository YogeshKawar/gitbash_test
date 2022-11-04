package Method_Overridding;

public class FatherSonOverriding {
public static void main(String[] args) {
	Father_Data f =new Father_Data();
	f.Home();
	f.Car();
	
	Son1 s =new Son1();
	s.Car();
	
	Son2 s1=new Son2();
	s1.Car();
	
}
}
