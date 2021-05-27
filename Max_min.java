package day2;

import java.util.Scanner;

public class Max_min {

	public static void main(String[] args) {
		int[] array= new int[5];
		int max=0, min;
		System.out.println("enter the array element");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			
		}
		System.out.println("---------------------------");
		for( int i=0;i<array.length;i++)
		{
			if(max>array[i])
			{
				continue;
			}
			else
			{
				max=array[i];
			}
		
		//System.out.println(array[i]);
		}
		System.out.println("maximum num is "+max);
		min=array[0];
		
		for( int i=0;i<array.length;i++)
		{ 
			if(min>array[i])
			{
				min=array[i];
			}
			else
			{
				continue;
			}
		
		}
		System.out.println("minimum number is " +min);
		

	}

}
