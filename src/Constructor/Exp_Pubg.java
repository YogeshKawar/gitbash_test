package Constructor;

public class Exp_Pubg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp_Gun e=new Exp_Gun();
		e.shoot();
		System.out.println("Operation Completed");
		Exp_Gun e1=new Exp_Gun(10,"AK47");
		e1.shoot();
		System.out.println("Operation Completed");
	}

}
