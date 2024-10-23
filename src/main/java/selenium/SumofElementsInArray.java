package selenium;

import java.util.Scanner;

public class SumofElementsInArray {
	public static void main(String a[])
	{
		System.out.print("Enter the number of elements in the array: ");
        
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

        int[] b = new int[n];
        int oddcount=0,evencount=0;
        int evensum =0,oddsum=0;
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
        	if(b[i]%2==0)
        	{
        		evencount += 1;
        		evensum += b[i];
        	}
        	else {
        		oddcount +=1;
        		oddsum += b[i];
        	}
        	
        	
        }
        System.out.println(evencount);
        System.out.println(evensum);
        System.out.println(oddcount);
        System.out.println(oddsum);
	}
}
