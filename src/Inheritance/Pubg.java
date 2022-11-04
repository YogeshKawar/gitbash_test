package Inheritance;

public class Pubg extends Gun{

	String name;
	int n;
	Pubg()
	{
		name="Ak47";
		n=5;
	}
	Pubg(int n, String name)
	{
		this.n=10;
		this.name=name;
	}
	public void shoot()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Shoot...." +i);
		}
	}
}
