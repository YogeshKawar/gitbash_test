package Inheritance;

public class Sgl_inheritance_Gun_Pubg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pubg p=new Pubg();
		p.shoot();
		System.out.println("First Shoot done");
		Pubg p1=new Pubg(5,"Pistol");
		p1.shoot();
		System.out.println("Second shoot done");
		p.shootFromParent();

	}

}
