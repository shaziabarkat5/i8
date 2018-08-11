import java.util.*;
import java.lang.*;
public class array1 {

	public static void main(String[] args) 
	{
		int n=0,a = 0,a1=0,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no. of elements : ");
		n = s.nextInt();
		int d[] = new int [n];
		Scanner b = new Scanner(System.in);
		System.out.println("enter the difference between two no :");
		a = b.nextInt();
		System.out.println("enter the first element :");
		a1 = b.nextInt();
		int s1=a1;
		d[0]= a1;
		for(int i=1;i<n;i++)
		{
			
			s1=s1+a;
			d[i]=s1;
			
		}
		System.out.println("elements are :");
		for(int k=0;k<n;k++)
		{
			System.out.println(d[k]);
		
		}
		for(int j : d)
		{
		  sum = sum + j;	
		 }
		System.out.println("the sum is :");
		System.out.println(sum);
	s.close();
	b.close();
	}

}
