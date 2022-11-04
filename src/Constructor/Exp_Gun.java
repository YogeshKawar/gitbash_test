package Constructor;

public class Exp_Gun {
	
	int n;
	String name;
	Exp_Gun(){
		n=5;
		name="Pistol";
	}
	Exp_Gun(int n, String name){
	this.n=n;
	this.name = name;
}
	
	public void shoot()
	{
		for (int i=1;i<n;i++)
		{
			System.out.println("Shoot:"+i);
		}
	}
}
