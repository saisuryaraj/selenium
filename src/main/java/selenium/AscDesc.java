package selenium;

public class AscDesc {
	public static void main(String a[])
	{
		int[] b= {56,98,66,24,96,57,28,69};
		int n=b.length;
		int temp =0;
	
			
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<n-1;j++)
				{
				if(b[j] > b[j+1]) 
				{
					temp =b[j];
					b[j] =b[j+1];
					b[j+1]=temp;
				}
				}
			
//			for(int j =0;j<n/2;j++)
//			{
//			if(b[j] < b[j+1]) 
//			{
//				temp =b[j];
//				b[j] =b[j+1];
//				b[j+1]=temp;
//			}
//			}
		}
			for(int i=0;i<n;i++) {
			System.out.print(b[i]+" " );
			}
	}

}