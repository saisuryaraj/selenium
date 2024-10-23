package selenium;

//import java.util.Scanner;

public class MaxMinInArray {
	public static void main(String a[])
	{
		/*System.out.print("Enter the number of elements in the array: ");
        
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

        int[] b = new int[n];
        
        int max=b[0];
        int min=b[0];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        */
        int[] b = {56,96,66,2,9};
        int n=b.length;
        int max=b[0];
        int min=b[0];
        for(int i=0;i<n;i++)
        {
        	if(max < b[i])
        	{
        		max = b[i];
        	}
        	
        	if(min > b[i])
        	{
        		min = b[i];
        	}
        }
        
        
        
        System.out.println(max);
        System.out.println(min);
        
        //scanner.close();
	}
}
