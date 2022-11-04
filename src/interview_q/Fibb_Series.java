package interview_q;

public class Fibb_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1+ " ");
		System.out.println(n2+ " ");
		for(int i=2;i<20;i++)
		{
			sum=n1+n2;
			System.out.println(sum + " ");
			n1=n2;
			n2=sum;
		}
	}

}
