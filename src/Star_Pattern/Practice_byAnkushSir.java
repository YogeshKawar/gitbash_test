package Star_Pattern;

public class Practice_byAnkushSir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
			star++;
			space--;
			
		}
		
		System.out.println();
		
		int space1=1;
		int star1=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
			space1++;
			star1--;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
