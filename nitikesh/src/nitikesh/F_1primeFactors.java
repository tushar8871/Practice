package nitikesh;

import java.util.Scanner;

public class F_1primeFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num :");
		int num=sc.nextInt();
		int count;
		System.out.println("Prime factors are: ");
	
		
		for(int i=2;i<=num;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0 && num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
	}
}