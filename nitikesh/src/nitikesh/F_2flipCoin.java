package nitikesh;

import java.util.Scanner;

public class F_2flipCoin 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of flips :");
		int n=sc.nextInt();
		
		int count=0,count1=0;
		if(n>0)
		{
			for(int i=0;i<n;i++)
			{
				if(Math.random()<0.5)    //it will just print numbers between 0 and 1 only.
				{
					count++;
				}
				else
				{
					count1++;
				}
			}
			int p1=(count*100)/n;
			int p2=(count1*100)/n;
			
			System.out.println("Posibility of Head :"+count+" with "+p1+"% .");
			System.out.println("Posibility of Tail :"+count1+" with "+p2+"% .");
		}
		else
		{
			System.out.println("!!! Enter a positive num. !!!");
		}
	}
}
