package Star_Pattern;

public class Single_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("squar patter");
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("@@@@@@ patter");
		
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<4;j++)
			{
				if(i==1 && j==1) {
					System.out.print("@");
				}
				else if(i==2 && j==2) {
					System.out.print("$");
				}
				else if(i==3 && j==3)
				{
					System.out.print("%");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Star pattern");
		
		for(int i=5;i>1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("traingle pattern");
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("katkon pattern");
		
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		 System.out.println("---------------");
		 
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++){
				
				if(i==1  ||  i==3   ||j==1  ||  j==4)
				{
					System.out.print("*");
				}
				else
				{
				    System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
