package Logical_Program;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int arr1[]= {40,50,10,20,30};
		//for(int i=0;i<=arr1.length-1;i++)
		//System.out.println(arr1[i]);
		//Arrays.sort(arr1);
		//for(int i=0;i<=arr1.length-1;i++)
			//System.out.println("Sorted array:"+arr1[i]);
		
		int temp=0;
		int[] ar2= new int[]{30,20,10,50,60};
		for(int i=0;i<ar2.length;i++)
		{
			for(int j=i+1;i<ar2.length;j++)
			{
				if(ar2[i]>ar2[j])
				{
					temp=ar2[i];
					ar2[i]=ar2[j];
					ar2[j]=temp;
				}
			}
			System.out.println(ar2[i]);
		}
		
	}

}
