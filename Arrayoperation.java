package day2;

import java.util.Scanner;

public class Arrayoperation {

	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] a= new int[n];
		System.out.println("enter array element");
		for( int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("these are array element you have entered");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
   System.out.println("enter any number ");
   int nu;
   nu=sc.nextInt();   
   for( int i=0;i<a.length;i++)
	{
		if(nu==a[i])
		{
			System.out.println("number is matched "+"index of array is "+i);
		}
	
	}
   
	int max=0, min;
   for( int i=0;i<a.length;i++)
	{
		if(max>a[i])
		{
			continue;
		}
		else
		{
			max=a[i];
		}
	
	//System.out.println(array[i]);
	}
	System.out.println("maximum num is "+max);
	min=a[0];
	
	for( int i=0;i<a.length;i++)
	{ 
		if(min>a[i])
		{
			min=a[i];
		}
		else
		{
			continue;
		}
	
	}
	System.out.println("minimum number is " +min);
	
	int sum=0, avg;
	for( int i=0;i<a.length;i++)
	{
		sum+=a[i];
	}
	System.out.println("sum of array element is "+sum);
	avg= sum/n;
	System.out.println("avarage of array element is "+avg);
   sc.close();
	}

}
