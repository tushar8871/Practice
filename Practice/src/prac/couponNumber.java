package prac;

import java.util.Random;
import java.util.Scanner;

public class couponNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to generate coupon : ");
		int n=sc.nextInt();
		int temp;
		int a[]=new int[n];
		Random ra=new Random();

		int j;
		
		for(int i=0;i<n;i++)
		{
			temp=ra.nextInt(n);
			a[i]=temp;
			for(j=0;j<=i;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.print(" "+i);
			}
		}
		/*
		 * for(int i=0;i<n;i++) { System.out.println("Random number : "+a[i]+ "\n"); }
		 */

	}

}
