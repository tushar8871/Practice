package prac;

import java.util.Random;
import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int stack,goal,n;
		System.out.println("Enter number of times to play : ");
		n=sc.nextInt();
		System.out.println("Enter stack : ");
		stack=sc.nextInt(); 
		System.out.println("Enter goal : ");
		goal=sc.nextInt();
		Random ra=new Random();
		int bet;
		int temp=goal;
		int temp1=stack;
		
		for(int i=0;i<n;i++)
		{
			
				bet=ra.nextInt(2);
				System.out.println(bet);
				if(bet==0)
				{
				stack=stack-(temp1/2);
				}
				else
				{
				stack=stack+(temp1/2);
				}
		
		}
		
		if(stack<=0)
		{
			System.out.println("Gambler has lost ! ");
		}
		else if(goal<=stack)
		{
			System.out.println("Gambler has won  ! And he has $"+(stack));
		}
		else {
			System.out.println("Gambler has won ! "+stack);
		}
		

	}

}
