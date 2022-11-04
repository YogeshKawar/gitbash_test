package Star_Pattern;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//
		//
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 && j==1)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//
		System.out.println();
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1 && j==1)
				{
					System.out.print("@");
				}
				else if(i==4 && j==4 )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//
		System.out.println();
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1 || i==3 || j==4 || j==1)
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
		
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
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
		
		/////////////////////
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j || i+j==6)
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
		////////////////////////
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("*");
		}
		
		///////////////
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			System.out.print("*");
		}
		
		/////////////////
		
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/////////////////
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		///////////////////
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		////////////////////
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
