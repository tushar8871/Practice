package nitikesh;

import java.util.Scanner;

public class F_3leapYear 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year to check it leap or not.");
		int n=sc.nextInt();
		leap(n);
	}
	
static void leap(int n)
{
	int count=0;
	int temp=n;
	
	while(temp>0)
	{
		temp=temp/10;
		count++;
	}	
	
	if(count==4)
	{
		if(n%4==0&&n%100!=0||n%400==0)
		{
			System.out.println(n+" is leap year.");
		}
		else
		{
			System.out.println(n+" not a leap year.");
		}
	}
	else
	{
		System.out.println("!!!Enter 4 digit number.!!!");
	}
	
}
}


