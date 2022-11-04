package Constructor;

public class FibbonacciSeries {
	int n1;
	int n2;
	int sum;
	int c;
	public void fbSeries() {
		for(int i=1;i<=c;i++)
		{
			sum= n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(n1);
		}
	}
	

}
