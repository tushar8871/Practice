package nitikesh;

import java.util.Scanner;

public class F_4powerOf2 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter power of 2 :");
		int n=sc.nextInt();
		int temp=2;
		if(n>0)
		{
			for(int i=1;i<n;i++)
			{
				temp=temp*2;
			}
			System.out.println("2^"+n+" : "+temp);
			F_3leapYear.leap(temp);
			
		}
		else
		{
			System.out.println("!!! Enter +ve num. !!!");
		}
	}
}
