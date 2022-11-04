package singleLevelInheritance;

public class inheritance {//ULC
public static void main(String[] args) {
	son s = new son();
	s.home();
	s.car();
	s.money();
	s.secBike();
	System.out.println("Happy life");
	
	son s2 = new son();
	s.car();//?
	s2.car();
}
}
