package Star_Pattern;

public class Upside_leftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}

}
