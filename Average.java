package day2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		float avg=0;
		System.out.println("enter array size");
	    Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int[] a= new int[n];
		System.out.println("enter array element");
		for(i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("these are array element you have entered");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
			System.out.println("sum of all array element is "+sum);
		
		avg=(sum/n);
		System.out.println("average of all array element"+avg);
		
		sc.close();
		
		

	}

}
